package pl.gda.wsb;

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

        Animal animal1 = new Animal("michal",4,"kot");
        Animal animal2 = new Animal("rafal",4,"pies");

        Phone phone1 = new Phone("smartphone","asd",123);
        Phone phone2 = new Phone("stationary","dsa",321);

        System.out.println(human1);
        System.out.println(human1.lastName);
    }
}
