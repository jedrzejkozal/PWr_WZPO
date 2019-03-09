package Dataset;

import java.util.List;

public interface IDatasetHolder {

	void addDataset(String filename);

	List<Dataset> getDatasets();

}