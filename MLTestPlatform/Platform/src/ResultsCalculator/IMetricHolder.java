package ResultsCalculator;

import java.util.ArrayList;

public interface IMetricHolder {

	void addMetricCalculator(IMetricCalculator metricCalculator);

	ArrayList<IMetricCalculator> getMetricCalculators();

}