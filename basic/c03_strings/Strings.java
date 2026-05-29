package basic.c03_strings;

public class Strings {

    public static void main(String[] args) {

        // Declaración

        String name = "Pablo";
        var surname = new String("Conde");

        // Operaciones básicas

        // Concatenación
        System.out.println(name + " " + surname);


        // Longitud
        System.out.println(name.length());


        // Obtener carácter
        System.out.println(name.charAt(name.length() - 1));


        // Subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));


        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name);

        // Comprobar si contiene
        System.out.println("Hola, Java".contains("Pablo"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));


        // Comparación
        System.out.println(name.equals("Pablo"));
        System.out.println(name.equals("pablo"));
        System.out.println(name.equalsIgnoreCase("PABLO"));

        // == vs. equals

        var a = "Pablo";
        var b = "Pablo";
        var c = new String("Pablo");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));


        // Trim
        System.out.println(" Hola, me llamo Pablo ".trim());

        // Replace
        System.out.println(" Hola, me llamo Pablo ".replace("Pablo", "Moure"));

        // Format
        var age = 37;
        System.out.println(String.format("Hola, %s. Tengo %d.", name, age));
    }
}
