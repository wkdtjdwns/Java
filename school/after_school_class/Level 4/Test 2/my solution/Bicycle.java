package level4Exam.me;

public class Bicycle implements Movable {
    private Integer gear;
    private TransportType transportType;

    public Bicycle(Integer gear) {
        this.gear = gear;
        this.transportType = TransportType.BICYCLE;
    }

    @Override
    public void move(Double distance) {
        System.out.println("자전거가 " + distance + " 거리를 " + gear + "단 기어로 이동했습니다.");
    }

    @Override
    public TransportType getTransportType() {
        return transportType;
    }
}
