package Genericos_2;

import java.util.List;

public class ListaUtil {
    public static <T> void imprimirLista(List<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }
}
