package Actividad_3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = List.of(
                new Producto("Teclado", "Perifericos", 45.0, 30),
                new Producto("Mouse", "Perifericos", 25.5, 50),
                new Producto("Monitor", "Hardware", 180.0, 15),
                new Producto("CPU", "Hardware", 320.0, 8),
                new Producto("Silla", "Muebles", 150.0, 12),
                new Producto("Escritorio", "Muebles", 260.0, 5),
                new Producto("Auriculares", "Perifericos", 80.0, 40),
                new Producto("Webcam", "Perifericos", 110.0, 20)
        );

        System.out.println("=== Actividad 3 - Streams con Productos ===");

        List<Producto> caros = productos.stream()
                .filter(p -> p.precio() > 100)
                .sorted(Comparator.comparingDouble(Producto::precio).reversed())
                .toList();
        System.out.println("1) Productos con precio > 100 (desc): " + caros);

        Map<String, Integer> stockPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(Producto::categoria,
                        Collectors.summingInt(Producto::stock)));
        System.out.println("2) Stock total por categoria: " + stockPorCategoria);

        String listado = productos.stream()
                .map(p -> p.nombre() + " - " + p.precio())
                .collect(Collectors.joining("; "));
        System.out.println("3) Listado nombre/precio: " + listado);

        double promedioGeneral = productos.stream()
                .mapToDouble(Producto::precio)
                .average()
                .orElse(0.0);
        Map<String, Double> promedioPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(Producto::categoria,
                        Collectors.averagingDouble(Producto::precio)));
        System.out.println("4) Precio promedio general: " + promedioGeneral);
        System.out.println("   Precio promedio por categoria: " + promedioPorCategoria);
    }
}
