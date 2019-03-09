public class ClassifierAdapter implements IAlgorithmAdapter {

	private ClassificationImpl classificationImpl;

	public ClassificationImpl getClassificationImpl() {
		return this.classificationImpl;
	}

	/**
	 * 
	 * @param classificationImpl
	 */
	public void setClassificationImpl(ClassificationImpl classificationImpl) {
		this.classificationImpl = classificationImpl;
	}

}