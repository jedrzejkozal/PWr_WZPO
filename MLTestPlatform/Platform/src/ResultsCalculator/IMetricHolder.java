package ResultsCalculator;

import java.util.List;

public interface IMetricHolder {

	/**
	 * 
	 * @param metricCalculator
	 */
	void addMetricCalculator(IMetricCalculator metricCalculator);

	List<IMetricCalculator> getMetricCalculators();

}