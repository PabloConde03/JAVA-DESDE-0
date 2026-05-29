package basic.c06_loops;

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
            int number = 1;
            while (number <= 10) {
                System.out.println(number);
                number++;
            }   
        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        
        ArrayList<String> names = new ArrayList<>();
        names.add("Pablo");
        names.add("Dev");
        names.add("PabloDev");
        int index = 0;
        do {
            System.out.println(names.get(index));
            index++;
        } while (index < names.size());        
        
        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.

        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("La suma total es: " + sum);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Valor en índice " + i + ": " + numbers[i]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.

        int[] numbersWithNegative = {1, 2, -3, 4, 5};
        for (int i = 0; i < numbersWithNegative.length; i++) {
            if (numbersWithNegative[i] < 0) {
                System.out.println("Número negativo encontrado: " + numbersWithNegative[i]);
                break;
            }
            System.out.println("Número positivo: " + numbersWithNegative[i]);
        }   

        // 10. Crea un programa que calcule el factorial de un número dado.
        int factorialNumber = 5;
        int factorialResult = 1;
        for (int i = 1; i <= factorialNumber; i++) {
            factorialResult *= i;
        }
        System.out.println("El factorial de " + factorialNumber + " es: " + factorialResult);
    }
}
