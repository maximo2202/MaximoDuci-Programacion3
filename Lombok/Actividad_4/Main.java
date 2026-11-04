package Actividad_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("C1", "Producto 1", "Proveedor 1", 50.0);
        Producto p2 = new Producto("C2", "Producto 2", "Proveedor 2", 75.5);

        ProductoRecord r1 = new ProductoRecord("R1", "Record 1", 10.0);
        ProductoRecord r2 = new ProductoRecord("R2", "Record 2", 20.0);

        List<ProductoRecord> records = new ArrayList<>();
        records.add(new ProductoRecord(p1.getCodigo(), p1.getNombre(), p1.getPrecio()));
        records.add(new ProductoRecord(p2.getCodigo(), p2.getNombre(), p2.getPrecio()));
        records.add(r1);
        records.add(r2);

        System.out.println("Productos:");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("Records:");
        for (ProductoRecord rec : records) {
            System.out.println(rec);
        }
    }
}
