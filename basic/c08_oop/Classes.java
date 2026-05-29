package basic.c08_oop;


public class Classes {

    public static void main(String[] args) {

        var person = new Person("Pablo", -38, "123456789A");

//        person.name = "Pablo";
//        person.age = 38;

        person.sayHello();

        person.name = "PabloDV";
        System.out.println(person.name);

//        person.id = "123456789A";

        System.out.println(person.getId());

        person.setAge(38);
        System.out.println(person.getAge());

        var person2 = new Person("PabloDV", 18, "123456789B");
        person2.sayHello();
    }
}