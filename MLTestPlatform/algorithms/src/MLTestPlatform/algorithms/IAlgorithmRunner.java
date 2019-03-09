package MLTestPlatform.algorithms;
import MLTestPlatform.validation.ValidationResults;

public interface IAlgorithmRunner {

	/**
	 * 
	 * @param aah
	 * @param vr
	 */
	AlgorithmsResults runAlgorithms(IAlgorithmAdapterHolder aah, ValidationResults vr);

}