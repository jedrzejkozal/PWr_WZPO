package ResultsCalculator;

import java.util.List;

public class MetricHolder implements IMetricHolder {

	private List<IMetricCalculator> metricCalculators;

	public void addMetricCalculator(IMetricCalculator metricCalculator) {
		// TODO - implement MLTestPlatform.metrics.MetricHolder.addMetricCalculator
		throw new UnsupportedOperationException();
	}

	public List<IMetricCalculator> getMetricCalculators() {
		return this.metricCalculators;
	}

}