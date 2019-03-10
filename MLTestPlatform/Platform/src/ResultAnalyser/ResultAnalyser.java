package ResultAnalyser;

import ResultsCalculator.ExperimentResults;

public class ResultAnalyser implements IResultAnalyser {

	private IPostHocTester postHocTester;
	private ResultSaver resultSaver;
	private PlotSaver plotSaver;
	private PlotGenerator plotGenerator;

	public ResultAnalyser() {
		plotGenerator = new PlotGenerator();
	}


	public void setResultSaver(String directory) {
		System.out.println("ResultAnalyser.setResultSaver");
		resultSaver = new ResultSaver(directory);
	}

	public void setPlotSaver(String directory) {
		System.out.println("ResultAnalyser.setPlotSaver");
		plotSaver = new PlotSaver(directory);
	}

	public void setPostHocTester(IPostHocTester test) {
		System.out.println("ResultAnalyser.setPostHocTester");
		postHocTester = test;
	}

	public void analyseResults(ExperimentResults results, String resultsFilename, String plotsFilename) {
		System.out.println("ResultAnalyser.analyseResults");
		PostHocResults postHocResults = postHocTester.runTests(results);
		resultSaver.saveResults(resultsFilename, results, postHocResults);

		Plots p = plotGenerator.preparePlots(results);
		plotSaver.savePlots(plotsFilename, p);
	}

}