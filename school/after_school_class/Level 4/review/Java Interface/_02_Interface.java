package review.abs;

import review.abs.camera.FactoryCam;
import review.abs.detector.AdvancedFireDetector;
import review.abs.detector.Detectable;
import review.abs.detector.FireDetector;
import review.abs.reporter.NormalReporter;
import review.abs.reporter.Reportable;
import review.abs.reporter.VideoReporter;

public class _02_Interface {

    public static void main(String[] args) {
        Reportable[] reportables = {
                new NormalReporter(),
                new VideoReporter()
        };

        for (Reportable reportable : reportables) {
            reportable.report();
        }

        System.out.println("---------------------");

        Detectable[] detectables = {
                new FireDetector(),
                new AdvancedFireDetector()
        };

        for (Detectable detectable : detectables) {
            detectable.detect();
        }

        System.out.println("---------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(new AdvancedFireDetector());
        factoryCam.setReporter(new VideoReporter());

        factoryCam.detect();
        factoryCam.report();
    }
}