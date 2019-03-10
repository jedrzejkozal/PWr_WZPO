package Validation;

import Dataset.IDatasetHolder;

public class Cv52 implements IValidationStrategy {

	public DataSplit getDataSplit(IDatasetHolder datasetHolder) {
		System.out.println("Cv52.getDataSplit");
		datasetHolder.getDatasets();

		return new DataSplit();
	}

}