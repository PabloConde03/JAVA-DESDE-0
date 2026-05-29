package basic.c10_extras;


import basic.c08_oop.Classes;
import basic.c08_oop.Person;

import java.util.Scanner;
//import basic.c08_oop.*;

public class Extras {

    static String globalName = "pablo";

    public static void main(String[] args) {

        // Extras

        // null

        String name = "Pablo";
        name = null;
        if (name != null) {
            System.out.println(name.toLowerCase());
        }

        // import

        new Person("Pablo", 18, "1");
        new Classes();

        // Scanner

        var scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        var age = scanner.nextInt();

        System.out.println("La edad es: " + age);

        // Scope: variables globales y locales

        test();

        // static
    }

    public static void test() {
        System.out.println(globalName);
    }
}
