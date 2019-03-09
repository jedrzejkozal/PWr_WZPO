package ResultAnalyser;

import ResultsCalculator.ExperimentResults;

public interface IResultAnalyser {

	void setResultSaver(String directory);
	void setPlotSaver(String directory);
	void setPostHocTester(ETest test);
	void analyseResults(ExperimentResults results);

}