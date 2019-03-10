package ResultsCalculator;

import Algorithm.AlgorithmsResults;

import java.util.ArrayList;

public class ResultsCalculator implements IResultsCalculator {

	public ExperimentResults calculateResults(AlgorithmsResults algorithmsResults, IMetricHolder metricHolder) {
		System.out.println("ResultsCalculator.calculateResults");

        ArrayList<IMetricCalculator> metrics = metricHolder.getMetricCalculators();
		for(IMetricCalculator m : metrics) {
			m.calculate(algorithmsResults);
		}
		return new ExperimentResults();
	}

}