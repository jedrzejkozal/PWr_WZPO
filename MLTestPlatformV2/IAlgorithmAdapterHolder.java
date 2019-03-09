public interface IAlgorithmAdapterHolder {

	List<IAlgorithmAdapter> getAlgorithmAdapters();

	/**
	 * 
	 * @param algorithmAdapter
	 */
	void addAlgorithmAdapter(IAlgorithmAdapter algorithmAdapter);

}