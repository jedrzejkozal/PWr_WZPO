package ResultsCalculator;

import java.util.ArrayList;
import java.util.List;

public class MetricHolder implements IMetricHolder {

	private List<IMetricCalculator> metricCalculators = new ArrayList<>();

	public void addMetricCalculator(IMetricCalculator metricCalculator) {
		System.out.println("MetricHolder.addMetricCalculator");
		metricCalculators.add(metricCalculator);
	}

	public List<IMetricCalculator> getMetricCalculators() {
	    System.out.println("MetricHolder.getMetricCalculators");
		return this.metricCalculators;
	}

}