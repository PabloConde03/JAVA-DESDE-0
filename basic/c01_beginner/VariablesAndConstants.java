package c01_beginner;

public class VariablesAndConstants {

    public static void main(String[] args) {

        // Variables

        String name = "Pablo";
        System.out.println(name);

        name = "PabloDev";
        System.out.println(name);

        // name = 37; Error (no podemos cambiar el tipo de dato)

        int age = 37;
        System.out.println(age);

        var email = "pablo@gmail.com";
        System.out.println(email);

        var year = 2025;
        System.out.println(year);

        // Constantes

        final String EMAIL = "pablo@gmail.com";
        // EMAIL = "brais@gmail.com"; Es constante
        System.out.println(EMAIL);
    }
}
