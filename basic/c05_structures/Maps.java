package basic.c05_structures;

import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        // Declaración y creación
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tamaño

        System.out.println(names.size());

        // Inserción

        names.put("Pablo", "pablo@gmail.com");
        names.put("Conde", "conde@gmail.com");
        names.put("pablodv", "pablodv@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceso

        System.out.println(names.get("Pablo"));
        System.out.println(names.get("Conde"));

        // Verificación

        System.out.println(names.containsKey("Pablo"));
        System.out.println(names.containsKey("Conde"));

        System.out.println(names.containsValue("pablo@gmail.com"));

        // Eliminación

        System.out.println(names.remove("Pablo"));
        System.out.println(names.remove("Conde"));
        System.out.println(names);

        // Limpieza

        names.clear();
        System.out.println(names);

        // Modificación

        names.put("Brais", "brais@gmail.com");
        System.out.println(names);

        names.put("Brais", "braismouredev@gmail.com");
        System.out.println(names);

        names.replace("Pablo", "pablodv@gmail.com"); // Reemplaza el valor si existe
        System.out.println(names);

        names.putIfAbsent("Conde", "conde@gmail.com"); // Solo lo añade si no existe
        System.out.println(names);

        // Otras operaciones

        System.out.println(names.isEmpty());
        var values = names.values();
        System.out.println(values);
     }
}
