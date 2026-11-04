package reflection;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    private String Saludar() {
        return "Hola";
    }

    public void mostrarInfo() {
        System.out.println("Persona{nombre=" + nombre + ", edad=" + edad + "}");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
