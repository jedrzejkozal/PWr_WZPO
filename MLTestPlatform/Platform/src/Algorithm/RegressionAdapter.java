package Algorithm;

import Validation.DataDivision;

public class RegressionAdapter implements IAlgorithmAdapter {

	private RegressionImpl regressionImpl = new RegressionImpl();

	public void fit(DataDivision division){
		System.out.println("RegressionAdapter.fit");
	}

	public SingleFoldAlgResult predict(DataDivision division){
		System.out.println("RegressionAdapter.predict");
		return new SingleFoldAlgResult();
	}

}