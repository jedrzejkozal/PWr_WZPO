package ResultAnalyser;

import ResultsCalculator.ExperimentResults;

public interface IPostHocTester {
    public void runTests(ExperimentResults results);
}
