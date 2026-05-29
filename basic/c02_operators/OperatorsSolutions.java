package basic.c02_operators;

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        var a = 5;
        var b = 3;
        var sum = a + b;
        var difference = a - b;
        var product = a * b;
        var quotient = a / b;

        // 2. Crea una variable para cada tipo de operación de asignación.

        var c = 10;
        c += 5; // c = c + 5
        var d = 20;
        d -= 5; // d = d - 5    
        var e = 2;
        e *= 3; // e = e * 3
        var f = 10;
        f /= 2; // f = f / 2

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(a > b);
        System.out.println(c == 15);
        System.out.println(d <= 15);

s
        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(a < b);
        System.out.println(c != 15);
        System.out.println(d > 15);

        // 5. Utiliza el operador lógico and.
        System.out.println(a > b && c == 15);


        // 6. Utiliza el operador lógico or.
        System.out.println(a < b || c == 15);

        // 7. Combina ambos operadores lógicos.
        System.out.println((a > b && c == 15) || d > 15);

        // 8. Añade alguna negación.
        System.out.println(!(a < b) && c == 15);

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println(+a);
        System.out.println(-b);     
        System.out.println(++c); // Pre-incremento
        System.out.println(d--); // Post-decremento 

        // 10. Combina operadores aritméticos, de comparación y lógicos.

        System.out.println((a + b) > (c - d) && e * f == 60);
        
    }
}
