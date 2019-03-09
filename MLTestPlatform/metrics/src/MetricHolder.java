import java.util.List;

public class MetricHolder implements IMetricHolder {

	private List<IMetricCalculator> metricCalculators;

	/**
	 * 
	 * @param metricCalculator
	 */
	public void addMetricCalculator(IMetricCalculator metricCalculator) {
		// TODO - implement MetricHolder.addMetricCalculator
		throw new UnsupportedOperationException();
	}

	public List<IMetricCalculator> getMetricCalculators() {
		return this.metricCalculators;
	}

}