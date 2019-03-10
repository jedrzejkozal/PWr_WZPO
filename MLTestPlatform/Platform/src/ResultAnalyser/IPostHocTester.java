package ResultAnalyser;

import ResultsCalculator.ExperimentResults;

public interface IPostHocTester {
    public PostHocResults runTests(ExperimentResults results);
}
