package ResultsCalculator;

import Algorithm.AlgorithmsResults;

public class ResultsCalculator implements IResultsCalculator {

	public ExperimentResults calculateResults(AlgorithmsResults algorithmsResults, IMetricHolder metricHolder) {
		System.out.println("ResultsCalculator.calculateResults");
		return new ExperimentResults();
	}

}