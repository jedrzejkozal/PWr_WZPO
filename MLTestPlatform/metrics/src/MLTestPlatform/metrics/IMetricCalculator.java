package MLTestPlatform.metrics;

import MLTestPlatform.algorithms.AlgorithmsResults;

public interface IMetricCalculator {

	/**
	 * 
	 * @param algorithmResults
	 */
	MetricResults calculate(AlgorithmsResults algorithmResults);

}