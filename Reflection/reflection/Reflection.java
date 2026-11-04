package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("reflection.Persona");
        System.out.println("Clase: " + clazz.getName());

        System.out.println("Constructores:");
        for (Constructor<?> c : clazz.getDeclaredConstructors()) {
            System.out.println(c);
        }

        Constructor<?> ctor = clazz.getDeclaredConstructor(String.class, int.class);
        Object persona = ctor.newInstance("Juan", 30);
        System.out.println("Objeto instanciado: " + persona);

        Field nombreField = clazz.getDeclaredField("nombre");
        nombreField.setAccessible(true);
        System.out.println("Nombre antes: " + nombreField.get(persona));
        nombreField.set(persona, "Carlos");
        System.out.println("Nombre despues: " + nombreField.get(persona));

        Method mostrarInfo = clazz.getDeclaredMethod("mostrarInfo");
        mostrarInfo.invoke(persona);

        Method saludar = clazz.getDeclaredMethod("Saludar");
        System.out.println("Modificadores Saludar: " + Modifier.toString(saludar.getModifiers()));
        saludar.setAccessible(true);
        Object resultado = saludar.invoke(persona);
        System.out.println("Saludar() => " + resultado);
    }
}
