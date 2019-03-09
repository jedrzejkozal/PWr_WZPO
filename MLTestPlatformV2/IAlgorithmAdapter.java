public interface IAlgorithmAdapter {

	/**
	 * 
	 * @param division
	 */
	void fit(DataDivision division);

	/**
	 * 
	 * @param division
	 */
	void predict(DataDivision division);

}