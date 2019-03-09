package Algorithm;

import java.util.List;

public interface IAlgorithmAdapterHolder {

	List<IAlgorithmAdapter> getAlgorithmAdapters();

	/**
	 * 
	 * @param algorithmAdapter
	 */
	void addAlgorithmAdapter(IAlgorithmAdapter algorithmAdapter);

}