package Genericos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Caja<String> cajaString = new Caja<>("Hola Genericos");
        Caja<Integer> cajaInteger = new Caja<>(42);

        System.out.println(cajaString);
        System.out.println(cajaInteger);

        // Colecciones sin genericos
        List lista = new ArrayList();
        lista.add("Texto");
        lista.add(123);
        for (Object o : lista) {
            System.out.println("Sin genericos: " + o);
        }
    }
}
