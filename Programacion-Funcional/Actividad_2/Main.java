package Actividad_2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                new Alumno("Ana", 8.5, "Java"),
                new Alumno("Luis", 6.0, "Java"),
                new Alumno("Maria", 9.2, "Python"),
                new Alumno("Carlos", 7.1, "Python"),
                new Alumno("Sofia", 5.5, "Java"),
                new Alumno("Diego", 8.0, "C#"),
                new Alumno("Lucia", 9.0, "C#"),
                new Alumno("Jorge", 4.3, "Python")
        );

        System.out.println("=== Actividad 2 - Streams con Alumnos ===");

        List<String> aprobados = alumnos.stream()
                .filter(a -> a.nota() >= 7)
                .map(a -> a.nombre().toUpperCase())
                .sorted()
                .toList();
        System.out.println("1) Aprobados (mayusculas, ordenados): " + aprobados);

        double promedioGeneral = alumnos.stream()
                .mapToDouble(Alumno::nota)
                .average()
                .orElse(0.0);
        System.out.println("2) Promedio general de notas: " + promedioGeneral);

        Map<String, List<Alumno>> porCurso = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::curso));
        System.out.println("3) Alumnos agrupados por curso: " + porCurso);

        List<Alumno> mejoresTres = alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::nota).reversed())
                .limit(3)
                .toList();
        System.out.println("4) 3 mejores promedios: " + mejoresTres);
    }
}
