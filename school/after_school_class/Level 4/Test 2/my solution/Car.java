package level4Exam.me;

public class Car implements Movable {

    private Double fuel;
    private FuelType fuelType;
    private TransportType transportType;

    public Car(Double fuel, FuelType fuelType) {
        this.fuel = fuel;
        this.fuelType = fuelType;
        this.transportType = TransportType.CAR;
    }

    public Double getRemainingFuel() {
        return fuel;
    }

    @Override
    public void move(Double distance) {
        fuel -= fuelType.calculateRequiredFuel(distance);

        if (fuel >= 0) {
            System.out.println("자동차가 " + distance + " 만큼 이동했습니다. 남은 연료: " + fuel);
        }

        else {
            System.out.println(distance + "만큼 이동하기에 연료가 충분하지 않습니다.");
        }
    }

    @Override
    public TransportType getTransportType() {
        return transportType;
    }
}
