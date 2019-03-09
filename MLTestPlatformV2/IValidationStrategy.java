public interface IValidationStrategy {

	/**
	 * 
	 * @param datasetHolder
	 */
	DataSplit getDataSplit(IDatasetHolder datasetHolder);

}