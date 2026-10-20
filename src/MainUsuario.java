public class MainUsuario {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        usuario.setUsername("alejandro07");
        usuario.setCorreo("alejandro.e@gmail.com");
        usuario.setNivel(2);
        usuario.activar();

        System.out.println("Username: " + usuario.getUsername());
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Nivel: " + usuario.getNivel());
        System.out.println("Activo: " + usuario.isActivo());

        usuario.setUsername("");
        usuario.setCorreo("");
        usuario.setNivel(-5);
        usuario.desactivar();

        System.out.println("Username: " + usuario.getUsername());
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Nivel: " + usuario.getNivel());
        System.out.println("Activo: " + usuario.isActivo());
    }
}