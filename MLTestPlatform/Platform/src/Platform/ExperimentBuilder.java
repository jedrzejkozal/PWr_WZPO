package Platform;
import Dataset.IDatasetHolder;
import Validation.IValidationStrategy;
import Algorithm.IAlgorithmAdapterHolder;
import Algorithm.IAlgorithmRunner;
import ResultsCalculator.IResultsCalculator;
import ResultsCalculator.IMetricHolder;

public class ExperimentBuilder {

	private Experiment experiment;

	public ExperimentBuilder() {
		experiment = new Experiment();
	}

	public <T>void add(T elem) {
		if(elem instanceof IDatasetHolder) {
			this.experiment.setDatasetHolder((IDatasetHolder) elem);
		}
		else if(elem instanceof IValidationStrategy) {
			this.experiment.setValidationStrategy((IValidationStrategy) elem);
		}
		else if(elem instanceof IAlgorithmAdapterHolder) {
			this.experiment.setAlgorithmAdapterHolder((IAlgorithmAdapterHolder) elem);
		}
		else if(elem instanceof IAlgorithmRunner) {
			this.experiment.setAlgorithmRunner((IAlgorithmRunner) elem);
		}
		else if(elem instanceof IResultsCalculator) {
			this.experiment.setResultsCalculator((IResultsCalculator) elem);
		}
		else if(elem instanceof IMetricHolder) {
			this.experiment.setMetricHolder((IMetricHolder) elem);
		}
	}

	public Experiment build() {
		return this.experiment;
	}

}