package level4Exam.me;

public class Train implements Movable {

    private TransportType transportType;

    public Train() {
        this.transportType = TransportType.TRAIN;
    }

    @Override
    public void move(Double distance) {
        System.out.println("기차가 " + distance + " 거리를 " + transportType.getSpeed() + " 속도로 이동했습니다.");
    }

    @Override
    public TransportType getTransportType() {
        return transportType;
    }
}
