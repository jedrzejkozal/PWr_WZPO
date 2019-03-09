package MLTestPlatform.analysis;

import MLTestPlatform.results.ExperimentResults;

public interface IResultAnalyser {

	/**
	 * 
	 * @param directory
	 */
	void setResultSaver(String directory);

	/**
	 * 
	 * @param directory
	 */
	void setPlotSaver(String directory);

	/**
	 * 
	 * @param test
	 */
	void setPostHocTester(ETest test);

	/**
	 * 
	 * @param results
	 */
	void analyseResults(ExperimentResults results);

}