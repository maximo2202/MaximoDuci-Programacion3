package Actividad_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(new Producto("P001", "Teclado", 15000));
        listaProductos.add(new Producto("P002", "Mouse", 8000));
        listaProductos.add(new Producto("P003", "Monitor", 120000));

        Producto duplicado = new Producto("P001", "Teclado Mecánico", 20000);
        if (!listaProductos.contains(duplicado)) {
            listaProductos.add(duplicado);
        } else {
            System.out.println("El producto con código " + duplicado.getCodigo() + " ya existe. No se agrega.");
        }

        System.out.println("Lista de productos:");
        for (Producto p : listaProductos) {
            System.out.println(p);
        }
    }
}
