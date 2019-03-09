package MLTestPlatform.results;

import MLTestPlatform.algorithms.AlgorithmsResults;
import MLTestPlatform.metrics.IMetricHolder;

public interface IResultsCalculator {

	/**
	 * 
	 * @param algorithmsResults
	 * @param metricHolder
	 */
	ExperimentResults calculateResults(AlgorithmsResults algorithmsResults, IMetricHolder metricHolder);

}