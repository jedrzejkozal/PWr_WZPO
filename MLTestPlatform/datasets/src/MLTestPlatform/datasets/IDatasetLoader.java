package MLTestPlatform.datasets;

public interface IDatasetLoader {

	/**
	 * 
	 * @param filename
	 */
	Dataset loadDataset(String filename);

}