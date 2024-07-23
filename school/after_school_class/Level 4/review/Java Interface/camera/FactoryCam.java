package review.abs.camera;

import review.abs.detector.Detectable;
import review.abs.reporter.Reportable;

public class FactoryCam extends Camera {

    private Detectable detector;
    private Reportable reporter;

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    public void detect() {
        detector.detect();
    }

    public void report() {
        reporter.report();
    }
}