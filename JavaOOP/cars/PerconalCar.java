package cars;

public class PerconalCar extends Car {

    private final int numberOfSeats;

    public PerconalCar(String brand, int numberOfSeats) {
        super(brand);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return "PerconalCar{" +
                "numberOfSeats=" + numberOfSeats +
                '}';
    }
}
