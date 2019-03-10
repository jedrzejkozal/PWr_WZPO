package Platform;

import Algorithm.AlgorithmsResults;
import Dataset.Dataset;
import Dataset.IDatasetHolder;
import ResultsCalculator.*;
import Validation.DataSplit;
import Validation.IValidationStrategy;
import Algorithm.IAlgorithmAdapterHolder;
import Algorithm.IAlgorithmRunner;

import java.util.List;

public class Experiment {

	private IDatasetHolder datasetHolder;
	private IValidationStrategy validationStrategy;
	private IAlgorithmAdapterHolder algorithmAdapterHolder;
	private IAlgorithmRunner algorithmRunner;
	private IResultsCalculator resultsCalculator;
	private IMetricHolder metricHolder;

	public void setDatasetHolder(IDatasetHolder datasetHolder) {
		System.out.println("Experiment.setDatasetHolder");
		this.datasetHolder = datasetHolder;
	}

	public void setValidationStrategy(IValidationStrategy validationStrategy) {
		System.out.println("Experiment.setValidationStrategy");
		this.validationStrategy = validationStrategy;
	}

	public void setAlgorithmAdapterHolder(IAlgorithmAdapterHolder algorithmAdapterHolder) {
		System.out.println("Experiment.setAlgorithmAdapterHolder");
		this.algorithmAdapterHolder = algorithmAdapterHolder;
	}

	public void setAlgorithmRunner(IAlgorithmRunner algorithmRunner) {
		System.out.println("Experiment.setAlgorithmRunner");
		this.algorithmRunner = algorithmRunner;
	}

	public void setResultsCalculator(IResultsCalculator resultsCalculator) {
		System.out.println("Experiment.setResultsCalculator");
		this.resultsCalculator = resultsCalculator;
	}

	public void setMetricHolder(IMetricHolder elem) {
		System.out.println("Experiment.runExperiment : starting the experiment execution");
		this.metricHolder = elem;
	}

	public ExperimentResults runExperiment() {
		System.out.println("Experiment.runExperiment : starting the experiment execution");

		DataSplit dataSplit = this.validationStrategy.getDataSplit(this.datasetHolder);
		AlgorithmsResults algResults = this.algorithmRunner.runAlgorithms(this.algorithmAdapterHolder, dataSplit);
		ExperimentResults expResults = this.resultsCalculator.calculateResults(algResults, new MetricHolder()); //TODO: send field of type IMetricCalculator

		return expResults;
	}
}