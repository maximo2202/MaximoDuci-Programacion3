package Actividad_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("P1", "Libro", 100.0, "Autor 1"));
        productos.add(new Producto("P2", "Cuaderno", 50.0, "Autor 2"));
        productos.add(new Producto("P3", "Lapicera", 10.0, "Autor 3"));

        List<ProductoDTO> dtos = new ArrayList<>();
        for (Producto p : productos) {
            ProductoDTO dto = new ProductoDTO();
            dto.setCodigo(p.getCodigo());
            dto.setNombre(p.getNombre());
            dto.setPrecio(p.getPrecio());
            dtos.add(dto);
        }

        System.out.println("Lista de ProductoDTO:");
        for (ProductoDTO dto : dtos) {
            System.out.println(dto);
        }
    }
}
