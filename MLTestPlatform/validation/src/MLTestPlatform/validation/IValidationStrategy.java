package MLTestPlatform.validation;

import MLTestPlatform.datasets.IDatasetHolder;

public interface IValidationStrategy {

	/**
	 * 
	 * @param datasetHolder
	 */
	void getValidation(IDatasetHolder datasetHolder);

}