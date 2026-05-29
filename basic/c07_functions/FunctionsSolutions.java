package basic.c07_functions;


public class FunctionsExercises {

    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        
        welcomeMessage();

         // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.

        greetPerson("Brais");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
    }

        public static void welcomeMessage() {
            System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
        }

        public static void greetPerson(String name) {
            System.out.println("¡Hola, " + name + "! Bienvenido al curso.");
        }

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
    
        public static int square(int n) {
            return n * n;
        }

        // 5. Escribe una función que reciba un número y diga si es par o impar.

        public static String evenOrOdd(int number) {
            if (number % 2 == 0) {
                return "El número " + number + " es par.";
            } else {
                return "El número " + number + " es impar.";
            }
        }

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).

        public static boolean isAdult(int age) {
            return age >= 18;
        }

        // 7. Implementa una función que reciba una cadena y retorne su longitud.

        public static int getLength(String str) {
            return str.length();
        }

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.

        public static double calculateAverage(int[] numbers) {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return (double) sum / numbers.length;
        }

        // 9. Escribe un método que reciba un número y retorna su factorial.

        public static long factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.

        public static void printStringList(ArrayList<String> list) {
            for (String item : list) {
                System.out.println(item);
            }
    }
}
