package Actividad_1;

public class Main {
    public static void main(String[] args) {
        Persona conConstructor = new Persona("Ana", 25);
        Persona sinConstructor = new Persona();
        sinConstructor.setNombre("Luis");
        sinConstructor.setEdad(30);

        System.out.println("Persona 1: " + conConstructor.getNombre() + " - " + conConstructor.getEdad());
        System.out.println("Persona 2: " + sinConstructor.getNombre() + " - " + sinConstructor.getEdad());
    }
}
