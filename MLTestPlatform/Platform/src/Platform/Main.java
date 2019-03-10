package Platform;
import Algorithm.AlgorithmAdapterHolder;
import Algorithm.AlgorithmRunner;
import Algorithm.ClassifierAdapter;
import Dataset.DatasetHolder;
import Dataset.DatasetLoader;
import Dataset.Dataset;
import ResultAnalyser.ResultAnalyser;
import ResultAnalyser.PostHocTester;
import ResultsCalculator.MetricHolder;
import ResultsCalculator.ResultsCalculator;
import ResultsCalculator.AccCalculator;
import Validation.Cv52;


public class Main {
    public static void main(String[] Args) {

        TestPlatform tp = new TestPlatform();
        tp.setResultAnalyser(setupResultAnalyser());

        DatasetHolder datasetHolder = new DatasetHolder();
        datasetHolder.addDataset("datasetFilename");

        MetricHolder metricHolder = new MetricHolder();
        metricHolder.addMetricCalculator(new AccCalculator());

        AlgorithmAdapterHolder algorithmAdapter = new AlgorithmAdapterHolder();
        algorithmAdapter.addAlgorithmAdapter(new ClassifierAdapter());

        ExperimentBuilder experimentBuilder = tp.getExperimentBuilder();
        experimentBuilder.add(datasetHolder);
        experimentBuilder.add(new Cv52());
        experimentBuilder.add(metricHolder);
        experimentBuilder.add(new ResultsCalculator());
        experimentBuilder.add(algorithmAdapter);
        experimentBuilder.add(new AlgorithmRunner());

        tp.run();

        System.out.println("Shutting down...");
    }

    private static ResultAnalyser setupResultAnalyser(){
        ResultAnalyser analyser = new ResultAnalyser();

        analyser.setResultSaver("dir/for/results");
        analyser.setPlotSaver("/dir/for/plots");
        analyser.setPostHocTester(new PostHocTester());
        return analyser;
    }
}