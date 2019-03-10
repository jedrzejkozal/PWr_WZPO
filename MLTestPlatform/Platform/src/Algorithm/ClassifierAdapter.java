package Algorithm;

import Validation.DataDivision;

public class ClassifierAdapter implements IAlgorithmAdapter {

	private ClassificationImpl classificationImpl = new ClassificationImpl();

	public void fit(DataDivision division){
		System.out.println("ClassifierAdapter.fit");
	}

	public SingleFoldAlgResult predict(DataDivision division){
		System.out.println("ClassifierAdapter.predict");
		return new SingleFoldAlgResult();
	}

}