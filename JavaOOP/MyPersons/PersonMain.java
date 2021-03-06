package MyPersons;

import cars.Car;
import cars.PerconalCar;
import cars.Truck;

import java.util.Arrays;

public class PersonMain {
    public static void main(String[] args) {
//        Person[] persons = {
//                new Person("Janko"),
//                new Person("Peter", 20),
//                new Person("Michaela", 250),
//                new Student("Marian", "12345"),
//                new Student("Marina", 99, "65532"),
//                new Employee("Robert", 35, "master mega chief")
//        };
//
//        for (Person person : persons) {
//            person.setAge(300); //NIE
//            System.out.println(person.toString()); //person.toString()
//        }
//
//        System.out.println(Person.JAHODA);

//        Person p1 = new Person("Jan");
//        Person p2 = p1;
//        p2.setName("Peter");
//        System.out.println(p1);
//        System.out.println(p2);

//        Student s1 = new Student("Matej", "384709");
//        System.out.println(s1 instanceof Student);
//        System.out.println(s1 instanceof Person);
//        System.out.println(s1 instanceof Object);
//
//        Car c = new Car("BMW");
//        System.out.println(s1);
//        s1.setCar(c);
//        System.out.println(s1);
//        s1.getCar().start();
//        System.out.println(s1);
//        s1.getCar().stop();
//        System.out.println(s1);
//        System.out.println(s1.getClass());





//        Person p1 = new Person("David");
//        Person p2 = new Person("Tomas");
//
//        PerconalCar personalCar = new PerconalCar("BMW", 4);
//        p1.setCar(personalCar);
//        System.out.println(p1);
//
//        Truck truck = new Truck("Ford", "Wood");
//        p2.setCar(truck);
//        System.out.println(p2);
//
//        Person[] persons = {p1,p2};
//
//        for (Person person : persons) {
//            if(person.getCar() != null) {
//                person.getCar().start();
//            }
//            System.out.println(person.toString()); //person.toString()
//        }

        Person[] persons = {
                new Person("Janko" , 35),
                new Person("Peter", 20),
                new Person("Michaela", 75),
                new Person("Michaela", 5),
                new Person("Michaela", 28),
                new Person("Michaela", 99)
        };

        Person p1 = persons[0];
        Person p2 = persons[0];
        Person p3 = persons[0];
        Person p4 = persons[0];
        Person p5 = persons[0];
        Person p6 = persons[0];




        Arrays.sort(persons);

        for (Person person: persons) {
            System.out.println(person);
        }

    }
}
