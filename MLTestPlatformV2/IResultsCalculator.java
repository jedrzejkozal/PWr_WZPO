public interface IResultsCalculator {

	/**
	 * 
	 * @param results
	 * @param metricHolder
	 */
	ExperimentResults calculateResults(AlgorithmsResults results, IMetricHolder metricHolder);

}