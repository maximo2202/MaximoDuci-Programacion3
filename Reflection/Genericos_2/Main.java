package Genericos_2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> enteros = Arrays.asList(1, 2, 3);
        List<String> cadenas = Arrays.asList("uno", "dos", "tres");

        System.out.println("Enteros:");
        ListaUtil.imprimirLista(enteros);

        System.out.println("Cadenas:");
        ListaUtil.imprimirLista(cadenas);
    }
}
