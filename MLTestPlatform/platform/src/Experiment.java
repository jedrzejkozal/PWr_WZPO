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
		// TODO - implement Experiment.setDatasetHolder
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param validationStrategy
	 */
	public void setValidationStrategy(IValidationStrategy validationStrategy) {
		// TODO - implement Experiment.setValidationStrategy
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param resultsCalculator
	 */
	public void setResultsCalculator(ResultsCalculator resultsCalculator) {
		// TODO - implement Experiment.setResultsCalculator
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param algorithmAdapterHolder
	 */
	public void setAlgorithmAdapterHolder(IAlgorithmAdapterHolder algorithmAdapterHolder) {
		// TODO - implement Experiment.setAlgorithmAdapterHolder
		throw new UnsupportedOperationException();
	}

	public ExperimentResults runExperiment() {
		// TODO - implement Experiment.runExperiment
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