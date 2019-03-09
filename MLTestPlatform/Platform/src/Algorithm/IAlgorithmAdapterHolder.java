package Algorithm;

import java.util.List;

public interface IAlgorithmAdapterHolder {

	List<IAlgorithmAdapter> getAlgorithmAdapters();

	void addAlgorithmAdapter(IAlgorithmAdapter algorithmAdapter);

}