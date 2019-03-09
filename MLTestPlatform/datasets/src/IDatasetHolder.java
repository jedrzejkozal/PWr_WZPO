import java.util.List;

public interface IDatasetHolder {

	/**
	 * 
	 * @param filename
	 */
	void addDataset(String filename);

	List<Dataset> getDatasets();

}