package Actividad_2;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = Usuario.builder()
                .id(1)
                .nombre("Ana")
                .email("ana@mail.com")
                .build();

        Usuario u2 = Usuario.builder()
                .id(2)
                .nombre("Luis")
                .email("luis@mail.com")
                .build();

        System.out.println(u1);
        System.out.println(u2);
    }
}
