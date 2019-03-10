package Algorithm;
import java.util.ArrayList;
import java.util.List;

public class AlgorithmAdapterHolder implements IAlgorithmAdapterHolder {

	private List<IAlgorithmAdapter> algorithmAdapters = new ArrayList<>();

	public List<IAlgorithmAdapter> getAlgorithmAdapters() {
		System.out.println("AlgorithmAdapterHolder.getAlgorithmsAdapters");
		return this.algorithmAdapters;
	}

	public void addAlgorithmAdapter(IAlgorithmAdapter algorithmAdapter) {
		System.out.println("AlgorithmAdapterHolder.addAlgorithmAdapter");
		algorithmAdapters.add(algorithmAdapter);
	}

}