package Validation;

import Dataset.IDatasetHolder;

public interface IValidationStrategy {

	DataSplit getDataSplit(IDatasetHolder datasetHolder);

}