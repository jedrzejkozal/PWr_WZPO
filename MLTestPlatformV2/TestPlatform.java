public class TestPlatform {

	private IResultAnalyser resultAnalyser;
	private ExperimentBuilder experimentBuilder;
	private Experiment experiment;

	public ExperimentBuilder getExperimentBuilder() {
		return this.experimentBuilder;
	}

	/**
	 * 
	 * @param resultAnalyser
	 */
	public void setResultAnalyser(IResultAnalyser resultAnalyser) {
		this.resultAnalyser = resultAnalyser;
	}

}