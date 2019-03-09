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
	 * @param postHocTester
	 */
	void setPostHocTester(IPostHocTester postHocTester);

	/**
	 * 
	 * @param results
	 */
	void analyseResults(ExperimentResults results);

}