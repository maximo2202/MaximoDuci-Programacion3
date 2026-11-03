package Actividad_5;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Producto> conjuntoProductos = new HashSet<>();

        conjuntoProductos.add(new Producto("P001", "Teclado", 15000));
        conjuntoProductos.add(new Producto("P002", "Mouse", 8000));
        conjuntoProductos.add(new Producto("P003", "Monitor", 120000));

        // Productos repetidos (mismo codigo) no deben duplicarse
        conjuntoProductos.add(new Producto("P001", "Teclado Mecánico", 20000));
        conjuntoProductos.add(new Producto("P002", "Mouse Gamer", 12000));

        System.out.println("Cantidad de productos en el HashSet: " + conjuntoProductos.size());
        System.out.println("Lista de productos:");
        for (Producto p : conjuntoProductos) {
            System.out.println(p);
        }
    }
}
