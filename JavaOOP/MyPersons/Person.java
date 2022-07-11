package MyPersons;


import cars.Car;
import cars.PerconalCar;
import cars.Truck;

public class Person {
    public static final String JAHODA = "Jahoda";
    private String name; // = null;
    private int age; // = 0;
    private Car car;

    public Person(String name) {
        this(name, 5);
    }

    public Person(String name, int age) {
        this.name = name;
        if(isValidAge(age)) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(isValidAge(age)) {
            this.age = age;
        }
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public PerconalCar getPc1() {
        return pc1;
    }

    public void setPc1(PerconalCar pc1) {
        this.pc1 = pc1;
    }

    public Truck getT1() {
        return t1;
    }

    public void setT1(Truck t1) {
        this.t1 = t1;
    }

    private boolean isValidAge(int ageNew) {
        return ageNew >= 0 && ageNew <= 150;
    }

    @Override
    public String toString() {
        return "MyPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                (car != null ? ", car=" + car : "") +
                '}';
    }
}
