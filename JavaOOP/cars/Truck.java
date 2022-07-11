package cars;

public class Truck {

    private String load = "Drevo";

    public Truck() {
        this("Nic");
    }

    public Truck(String load) {
        this.load = load;
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    public void unload() {
        this.load = null;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "load='" + load + '\'' +
                '}';
    }
}
