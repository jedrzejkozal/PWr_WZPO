package Dataset;

import java.util.List;

public class DatasetHolder implements IDatasetHolder {

	private List<Dataset> datasets;
	private IDatasetLoader datasetLoader;

	public void addDataset(String filename) {
		// TODO - implement MLTestPlatform.datasets.DatasetHolder.addDataset
		throw new UnsupportedOperationException();
	}

	public List<Dataset> getDatasets() {
		return this.datasets;
	}

}