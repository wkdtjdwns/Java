package lang.object.tostring;

public class Car {

    private String carName;

    public String carInfo() {
        return "Car{" +
                "carName='" + carName + '\'' +
                '}';
    }

    public Car(String carName) {
        this.carName = carName;
    }
}
