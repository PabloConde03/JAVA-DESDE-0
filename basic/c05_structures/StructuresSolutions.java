package basic.c05_structures;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Longitud del Array: " + array.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("Valor en el índice 2 antes de modificar: " + array[2]);
        array[2] = 10;
        System.out.println("Valor en el índice 2 después de modificar: " + array[2]);

        // 3. Crea un ArrayList vacío.
         java.util.ArrayList<String> list = new java.util.ArrayList<>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        list.add("Valor 1");
        list.add("Valor 2");
        list.add("Valor 3");
        list.add("Valor 4");
        System.out.println("ArrayList después de añadir 4 valores: " + list);
        list.remove(1);
        System.out.println("ArrayList después de eliminar el segundo valor: " + list);

        // 5. Crea un HashSet con 2 valores diferentes.

        java.util.HashSet<String> set = new java.util.HashSet<>();
        set.add("Valor A");
        set.add("Valor B");
        System.out.println("HashSet inicial: " + set);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        set.add("Valor A"); // Repetido
        set.add("Valor C"); // Sin repetir
        System.out.println("HashSet después de añadir un valor repetido y otro sin repetir: " + set);

        // 7. Elimina uno de los elementos del HashSet.
        set.remove("Valor B");
        System.out.println("HashSet después de eliminar un elemento: " + set);  

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        java.util.HashMap<String, String> contacts = new java.util.HashMap<>();
        contacts.put("Alice", "123-456-7890");
        contacts.put("Bob", "098-765-4321");
        contacts.put("Charlie", "555-555-5555");
        System.out.println("HashMap de contactos: " + contacts);

        // 9. Modifica uno de los contactos y elimina otro.
        contacts.put("Alice", "111-111-1111"); // Modifica el número de Alice
        contacts.remove("Charlie"); // Elimina a Charlie
        System.out.println("HashMap de contactos después de modificar y eliminar: " + contacts);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        int[] originalArray = {1, 2, 3, 4, 5};
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();
        for (int num : originalArray) {
            arrayList.add(num);
        }
        System.out.println("ArrayList: " + arrayList);
        java.util.HashSet<Integer> hashSet = new java.util.HashSet<>(arrayList);
        System.out.println("HashSet: " + hashSet);
        java.util.HashMap<Integer, Integer> hashMap = new java.util.HashMap<>();
        for (Integer num : hashSet) {
            hashMap.put(num, num);
        }   
        System.out.println("HashMap: " + hashMap);
    }
}
