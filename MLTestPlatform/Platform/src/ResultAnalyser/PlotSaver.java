package ResultAnalyser;

public class PlotSaver {

	private String directory;

	public PlotSaver(String directory) {
		this.directory = directory;
	}

	public void savePlots(String filename, Plots plots) {
		System.out.println("PlotSaver.savePlots in directory: " + this.directory + " with name: " + filename);
	}

}