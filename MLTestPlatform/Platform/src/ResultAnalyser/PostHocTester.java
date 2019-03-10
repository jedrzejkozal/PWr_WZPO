package ResultAnalyser;

import ResultsCalculator.ExperimentResults;

public class PostHocTester implements IPostHocTester {

	public PostHocResults runTests(ExperimentResults results) {
		System.out.println("PostHocTester.runTest");
		return new PostHocResults();
	}

}