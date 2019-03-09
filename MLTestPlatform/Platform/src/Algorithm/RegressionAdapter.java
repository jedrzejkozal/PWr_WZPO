package Algorithm;

public class RegressionAdapter implements IAlgorithmAdapter {

	private RegressionImpl regressionImpl;

	public RegressionImpl getRegressionImpl() {
		return this.regressionImpl;
	}

	/**
	 * 
	 * @param regressionImpl
	 */
	public void setRegressionImpl(RegressionImpl regressionImpl) {
		this.regressionImpl = regressionImpl;
	}

}