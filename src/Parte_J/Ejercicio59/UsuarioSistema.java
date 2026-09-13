package Parte_J.Ejercicio59;

public class UsuarioSistema {

    public String nombreUsuario, clave;
    public boolean activo = false;

    public UsuarioSistema(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    public void activar() {
        this.activo = true;
        System.out.println("El usuario '" + nombreUsuario + "' ha sido activo");
    }

    public void desactivar() {
        this.activo = false;
        System.out.println("El usuario '" + nombreUsuario + "' ha sido desactivado.");
    }

    public void mostrarEstado() {

        String estado;

        if(activo == true){
            estado = "Activo";
        }
        else{
            estado = "Inactivo";
        }
        System.out.println(
            "ESTADO USUARIO \n"+
            "Usuario: " + nombreUsuario + "\n"+
            "Estado: " + estado +"\n"
        );
    }
}

class Main {
    public static void main(String[] args) {

        UsuarioSistema usuario = new UsuarioSistema("DAAZ", "12345");

        usuario.mostrarEstado();

        usuario.activar();
        usuario.mostrarEstado();

        usuario.desactivar();
        usuario.mostrarEstado();
    }
}