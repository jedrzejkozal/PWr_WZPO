package Dataset;

import java.util.ArrayList;
import java.util.List;

public class DatasetHolder implements IDatasetHolder {

	private List<Dataset> datasets = new ArrayList<>();
	private IDatasetLoader datasetLoader = new DatasetLoader();

	public void addDataset(String filename) {
	    System.out.println("DatasetHolder.addDataset");
		Dataset ds = datasetLoader.loadDataset(filename);
		datasets.add(ds);
	}

	public List<Dataset> getDatasets() {
		System.out.println("DatasetHolder.getDatasets");
		return this.datasets;
	}

}