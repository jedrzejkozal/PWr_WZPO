package Dataset;

public class DatasetLoader implements IDatasetLoader {

	public Dataset loadDataset(String filename) {
		System.out.println("DatasetLoader.loadDataset");
		return new Dataset();
	}

}