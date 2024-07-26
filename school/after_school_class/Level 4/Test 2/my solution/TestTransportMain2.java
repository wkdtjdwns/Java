package level4Exam.me;

public class TestTransportMain2 {

    public static void main(String[] args) {

        TransportManager<Car> carManager = new TransportManager<>();
        Car car = new Car(50.0, FuelType.GASOLINE);
        printInfo(carManager, car, 20.567);
        System.out.println("남은 연료: " + car.getRemainingFuel());
        printMovable(car);

        TransportManager<Bicycle> bicycleManager = new TransportManager<>();
        Bicycle bicycle = new Bicycle(3);
        printInfo(bicycleManager, bicycle, 10.234);
        printMovable(bicycle);

        TransportManager<Train> trainManager = new TransportManager<>();
        Train train = new Train();
        printInfo(trainManager, train, 100.789);
        printMovable(train);

        TransportManager<Motorcycle> motorcycleManager = new TransportManager<>();
        Motorcycle motorcycle = new Motorcycle(10.0, FuelType.DIESEL);
        printInfo(motorcycleManager, motorcycle, 5.5);
        System.out.println("남은 연료: " + motorcycle.getRemainingFuel());
        printMovable(motorcycle);
    }

    private static void printInfo(TransportManager manager, Movable movable, double distance) {
        manager.setTransport(movable);
        manager.moveTransport(distance);
    }

    private static void printMovable(Movable movable) {
        System.out.println("교통수단 종류: " + movable.getTransportType().getDescription());

        System.out.println("--------------------------------");
    }
}
