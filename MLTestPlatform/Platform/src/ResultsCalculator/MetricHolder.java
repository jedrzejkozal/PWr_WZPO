package ResultsCalculator;

import java.util.ArrayList;

public class MetricHolder implements IMetricHolder {

	private ArrayList<IMetricCalculator> metricCalculators = new ArrayList<>();

	public void addMetricCalculator(IMetricCalculator metricCalculator) {
		System.out.println("MetricHolder.addMetricCalculator");
		metricCalculators.add(metricCalculator);
	}

	public ArrayList<IMetricCalculator> getMetricCalculators() {
	    System.out.println("MetricHolder.getMetricCalculators");
		return this.metricCalculators;
	}

}