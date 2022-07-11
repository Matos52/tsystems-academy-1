package cars;

public class PerconalCar extends Car {

    private final int numberOfSeats;

    public PerconalCar() {
        this(4);
    }

    public PerconalCar(int numberOfSeats) {
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
