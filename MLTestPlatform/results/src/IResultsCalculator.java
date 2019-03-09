public interface IResultsCalculator {

	/**
	 * 
	 * @param algorithmsResults
	 * @param metricHolder
	 */
	ExperimentResults calculateResults(AlgorithmsResults algorithmsResults, IMetricHolder metricHolder);

}