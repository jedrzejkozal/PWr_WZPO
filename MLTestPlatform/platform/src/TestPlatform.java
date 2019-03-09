public class TestPlatform {

	private IResultAnalyser resultAnalyser;
	private ExperimentBuilder experimentBuilder;
	private Experiment experiment;

	public IResultAnalyser getResultAnalyser() {
		return this.resultAnalyser;
	}

	/**
	 * 
	 * @param resultAnalyser
	 */
	public void setResultAnalyser(ResultAnalyser resultAnalyser) {
		// TODO - implement TestPlatform.setResultAnalyser
		throw new UnsupportedOperationException();
	}

	public ExperimentBuilder getExperimentBuilder() {
		return this.experimentBuilder;
	}

	/**
	 * 
	 * @param experimentBuilder
	 */
	public void setExperimentBuilder(ExperimentBuilder experimentBuilder) {
		this.experimentBuilder = experimentBuilder;
	}

	public Experiment getExperiment() {
		return this.experiment;
	}

	/**
	 * 
	 * @param experiment
	 */
	public void setExperiment(Experiment experiment) {
		this.experiment = experiment;
	}

}