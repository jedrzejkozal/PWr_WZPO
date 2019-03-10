package Platform;

import ResultAnalyser.IResultAnalyser;
import ResultAnalyser.ResultAnalyser;
import ResultsCalculator.ExperimentResults;

public class TestPlatform {

	private IResultAnalyser resultAnalyser;
	private ExperimentBuilder experimentBuilder;
	private Experiment experiment;

	public TestPlatform(){
		experimentBuilder = new ExperimentBuilder();
		resultAnalyser = new ResultAnalyser();
	}

	public ExperimentBuilder getExperimentBuilder() {
		System.out.println("ExperimentBuilder.getExperimentBuilder");
		return this.experimentBuilder;
	}

	public void setResultAnalyser(IResultAnalyser resultAnalyser) {
		System.out.println("ExperimentBuilder.setResultAnalyser");
		this.resultAnalyser = resultAnalyser;
	}

	public void run() {
		this.experiment = experimentBuilder.build();
		ExperimentResults experimentResults = this.experiment.runExperiment();
		this.resultAnalyser.analyseResults(experimentResults, "resultsFilename", "plotsFilename");
	}
}