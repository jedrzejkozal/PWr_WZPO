package ResultAnalyser;

import ResultsCalculator.ExperimentResults;

public class ResultSaver {

	private String directory;

	public ResultSaver(String directory) {
		this.directory = directory;
	}

	public void saveResults(String filename, ExperimentResults results, PostHocResults postHocResults) {
		System.out.println("ResultSaver.saveResults in directory: " + this.directory + " with name: " + filename);
	}

}