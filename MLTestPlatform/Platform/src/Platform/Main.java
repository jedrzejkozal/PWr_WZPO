package Platform;
import Algorithm.AlgorithmAdapterHolder;
import Algorithm.AlgorithmRunner;
import Dataset.DatasetHolder;
import ResultAnalyser.ResultAnalyser;
import ResultAnalyser.PostHocTester;
import ResultsCalculator.MetricHolder;
import ResultsCalculator.ResultsCalculator;
import Validation.Cv52;


public class Main {
    public static void main(String[] Args) {

        TestPlatform tp = new TestPlatform();
        tp.setResultAnalyser(setupResultAnalyser());

        ExperimentBuilder experimentBuilder = tp.getExperimentBuilder();
        experimentBuilder.add(new DatasetHolder());
        experimentBuilder.add(new Cv52());
        experimentBuilder.add(new MetricHolder());
        experimentBuilder.add(new ResultsCalculator());
        experimentBuilder.add(new AlgorithmAdapterHolder());
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