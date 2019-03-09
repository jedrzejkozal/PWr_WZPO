package ResultAnalyser;

import ResultsCalculator.ExperimentResults;

public class ResultAnalyser implements IResultAnalyser {

	private ResultSaver resultSaver;
	private PlotSaver plotSaver;
	private PostHocTester postHocTester;

	public void setResultSaver(String directory) {
		System.out.println("ResultAnalyser.setResultSaver");
	}

	public void setPlotSaver(String directory) {
		System.out.println("ResultAnalyser.setPlotSaver");
	}

	public void setPostHocTester(IPostHocTester test) {
		System.out.println("ResultAnalyser.setPostHocTester");
	}

	public void analyseResults(ExperimentResults results) {
		System.out.println("ResultAnalyser.analyseResults");
	}

}