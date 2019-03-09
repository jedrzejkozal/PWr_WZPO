package Platform;
import Algorithm.IAlgorithmAdapterHolder;
import Algorithm.IAlgorithmRunner;
import Dataset.IDatasetHolder;
import ResultsCalculator.IResultsCalculator;
import Validation.IValidationStrategy;

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
	}

	public Experiment build() {
		return this.experiment;
	}

}