package ResultsCalculator;

import Algorithm.AlgorithmsResults;

public interface IResultsCalculator {

	ExperimentResults calculateResults(AlgorithmsResults algorithmsResults, IMetricHolder metricHolder);

}