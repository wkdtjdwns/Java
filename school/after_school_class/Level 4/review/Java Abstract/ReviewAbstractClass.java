package review.abs;

import review.abs.camera.Camera;
import review.abs.camera.FactoryCam;
import review.abs.camera.SpeedCam;

public class ReviewAbstractClass {

    public static void main(String[] args) {
        // Camera camera = new Camera(); // 추상 클래스는 인스턴스화 할 수 없음.
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        // 다형성 사용
        Camera speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
