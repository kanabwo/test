package pl.gda.wsb;

import pl.gda.wsb.devices.Car;
import pl.gda.wsb.devices.Phone;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
	// write your code here
        System.out.println("helloworld");

//        Human human1 = new Human();
//        Human human2 = new Human();
//
//
//        Animal animal1 = new Animal();
//        Animal animal2 = new Animal();
//
//        Phone phone1 = new Phone();
//        Phone phone2 = new Phone();
        Human human1 = new Human("Jan", "Nowak", "Assistant" );
        Human human2 = new Human("Janina", "Kowal", "CEO" );
        Human human3 = new Human("Janina", "Kowal", "CEO" );

        Animal animal1 = new Animal("kot","michal");
        Animal animal2 = new Animal("pies","rafal");

        Phone phone1 = new Phone("smartphone","asd",123);
        Phone phone2 = new Phone("stationary","dsa",321);

        System.out.println(human1);
        System.out.println(human1.lastName);

        if (animal1.legsNum > animal2.legsNum)
            System.out.println("wiecej nog ma "+ animal1.name);
        else
            System.out.println("wiecej nog ma "+ animal2.name);

        ArrayList <Human> hList = new ArrayList<>();
        hList.add(human1);
        hList.add(human2);

        for (Human h :hList) {
            System.out.println(h.lastName);


        }
        human1.pet = animal1;


        animal1.feed();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.feed();
        Car car1 = new Car("transit",Producer.FORD,80,1400,"blue");
        human1.car = car1;
        System.out.println(human1.lastName+" "+human1.pet.name+" "+human1.car.producer);



        System.out.println("wynik porownania: "+human2.equals(human3));

        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(car1);
        System.out.println(phone1);

        human1.setSalary(100000.0);
        System.out.println(human1.getSalary());

    }
}
