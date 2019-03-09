package MLTestPlatform.platform;

import MLTestPlatform.algorithms.IAlgorithmRunner;
import MLTestPlatform.datasets.IDatasetHolder;
import MLTestPlatform.results.ExperimentResults;
import MLTestPlatform.results.ResultsCalculator;
import MLTestPlatform.validation.IValidationStrategy;
import MLTestPlatform.results.IResultsCalculator;
import MLTestPlatform.algorithms.IAlgorithmAdapterHolder;

public class Experiment {

	private IDatasetHolder datasetHolder;
	private IValidationStrategy validationStrategy;
	private IResultsCalculator resultsCalculator;
	private IAlgorithmAdapterHolder algorithmAdapterHolder;
	private IAlgorithmRunner algorithmRunner;

	/**
	 * 
	 * @param datasetHolder
	 */
	public void setDatasetHolder(IDatasetHolder datasetHolder) {
		// TODO - implement MLTestPlatform.platform.Experiment.setDatasetHolder
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param validationStrategy
	 */
	public void setValidationStrategy(IValidationStrategy validationStrategy) {
		// TODO - implement MLTestPlatform.platform.Experiment.setValidationStrategy
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param resultsCalculator
	 */
	public void setResultsCalculator(ResultsCalculator resultsCalculator) {
		// TODO - implement MLTestPlatform.platform.Experiment.setResultsCalculator
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param algorithmAdapterHolder
	 */
	public void setAlgorithmAdapterHolder(IAlgorithmAdapterHolder algorithmAdapterHolder) {
		// TODO - implement MLTestPlatform.platform.Experiment.setAlgorithmAdapterHolder
		throw new UnsupportedOperationException();
	}

	public ExperimentResults runExperiment() {
		// TODO - implement MLTestPlatform.platform.Experiment.runExperiment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param algorithmRunner
	 */
	public void setAlgorithmRunner(IAlgorithmRunner algorithmRunner) {
		this.algorithmRunner = algorithmRunner;
	}

}