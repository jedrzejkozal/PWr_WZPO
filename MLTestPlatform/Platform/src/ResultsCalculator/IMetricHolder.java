package ResultsCalculator;

import java.util.List;

public interface IMetricHolder {

	void addMetricCalculator(IMetricCalculator metricCalculator);

	List<IMetricCalculator> getMetricCalculators();

}