package Platform;

import Dataset.IDatasetHolder;
import Validation.IValidationStrategy;
import Algorithm.IAlgorithmAdapterHolder;
import Algorithm.IAlgorithmRunner;
import ResultsCalculator.ExperimentResults;
import ResultsCalculator.IResultsCalculator;
import ResultsCalculator.ResultsCalculator; // TODO - po co to jest? powinien być sam interfejs

public class Experiment {

	private IDatasetHolder datasetHolder;
	private IValidationStrategy validationStrategy;
	private IAlgorithmAdapterHolder algorithmAdapterHolder;
	private IAlgorithmRunner algorithmRunner;
	private IResultsCalculator resultsCalculator;

	public void setDatasetHolder(IDatasetHolder datasetHolder) {
		// TODO - implement MLTestPlatform.platform.Experiment.setDatasetHolder
		throw new UnsupportedOperationException();
	}

	public void setValidationStrategy(IValidationStrategy validationStrategy) {
		// TODO - implement MLTestPlatform.platform.Experiment.setValidationStrategy
		throw new UnsupportedOperationException();
	}

	public void setAlgorithmAdapterHolder(IAlgorithmAdapterHolder algorithmAdapterHolder) {
		// TODO - implement MLTestPlatform.platform.Experiment.setAlgorithmAdapterHolder
		throw new UnsupportedOperationException();
	}

	public void setAlgorithmRunner(IAlgorithmRunner algorithmRunner) {
		this.algorithmRunner = algorithmRunner;
	}


	public void setResultsCalculator(ResultsCalculator resultsCalculator) {
		// TODO - implement MLTestPlatform.platform.Experiment.setResultsCalculator
		throw new UnsupportedOperationException();
	}

	public ExperimentResults runExperiment() {
		// TODO - implement MLTestPlatform.platform.Experiment.runExperiment
		throw new UnsupportedOperationException();
	}

}