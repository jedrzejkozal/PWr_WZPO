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
		this.datasetHolder = datasetHolder;
	}

	/**
	 * 
	 * @param validationStrategy
	 */
	public void setValidationStrategy(IValidationStrategy validationStrategy) {
		this.validationStrategy = validationStrategy;
	}

	/**
	 * 
	 * @param metricHolder
	 */
	public void setMetricHolder(IMetricHolder metricHolder) {
		// TODO - implement Experiment.setMetricHolder
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
		this.algorithmAdapterHolder = algorithmAdapterHolder;
	}

	/**
	 * 
	 * @param algorithmRunner
	 */
	public void setAlgorithmRunner(IAlgorithmRunner algorithmRunner) {
		this.algorithmRunner = algorithmRunner;
	}

	public ExperimentResults runExperiment() {
		// TODO - implement Experiment.runExperiment
		throw new UnsupportedOperationException();
	}

}