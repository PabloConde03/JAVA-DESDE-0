package basic.c03_strings;


public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String text1 = "Hola, ";
        String text2 = "mundo!";
        System.out.println(text1 + text2);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(text1.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(text1.charAt(0));
        System.out.println(text1.charAt(text1.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(text1.toUpperCase());
        System.out.println(text1.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(text1.contains("Hola"));

        // 6. Formatea un string con un entero.
        int age = 37;
        System.out.println(String.format("Hola, %s. Tengo %d.", text1, age));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String text3 = " Hola, me llamo Pablo ";
        System.out.println(text3.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(text3.replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        String a = "Hola";
        String b = "Hola";
        System.out.println(a.equals(b));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(a.length() == b.length());
    }
}
