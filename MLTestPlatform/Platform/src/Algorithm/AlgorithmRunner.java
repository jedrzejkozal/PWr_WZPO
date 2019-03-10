package Algorithm;

import Validation.DataSplit;

public class AlgorithmRunner implements IAlgorithmRunner {

	public AlgorithmsResults runAlgorithms(IAlgorithmAdapterHolder aah, DataSplit vr) {
		System.out.println("AlgorithmRunner.runAlgorithms");
		aah.getAlgorithmAdapters();
		return new AlgorithmsResults();
	}

}