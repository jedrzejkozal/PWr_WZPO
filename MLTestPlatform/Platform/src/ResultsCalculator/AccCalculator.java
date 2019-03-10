package ResultsCalculator;

import Algorithm.AlgorithmsResults;

public class AccCalculator implements IMetricCalculator {

	public MetricResults calculate(AlgorithmsResults algorithmResults) {
		System.out.println("AccCalculator.calculate");
		return new MetricResults();
	}

}