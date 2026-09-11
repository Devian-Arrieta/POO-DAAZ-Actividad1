package Parte_G.Ejercicio38;

public class Ventilador {

    public String marca;
    public int velocidad = 0;
    public boolean encendido = false;

    public Ventilador(String marca){
        this.marca = marca;
    }

    public void encender() {
        encendido = true;
        if (velocidad == 0) {
            velocidad = 1;
        }
    }

    public void apagar() {
        encendido = false;
        velocidad = 0;
    }

    public void subirVelocidad() {

        if (encendido == true) {

            if (velocidad < 3) {
                velocidad++;
            } else {
                System.out.println("El ventilador ya está en la velocidad máxima (3)");
            }

        } else {
            System.out.println("No se puede subir la velocidad porque el ventilador está apagado.");
        }
    }

    public void mostrarEstado() {
        String estado;

        if(encendido == true){
            estado = "encendido";
        }
        else{
            estado = "apagado";
        }

        System.out.println(
            "ESTADO DEL VENTILADOR \n"+
            "Marca: " + marca +"\n"+
            "Estado: " + estado +"\n"+
            "Velocidad actual: " + velocidad +"\n"
        );
    }
}

class Main {
    public static void main(String[] args) {

        Ventilador ventilador = new Ventilador("Samurai");

        ventilador.mostrarEstado();

        ventilador.encender();
        System.out.print("DESPUÉS DE ENCENDER: ");
        ventilador.mostrarEstado();

        ventilador.subirVelocidad();
        System.out.print("DESPUÉS DE SUBIR VELOCIDAD: ");
        ventilador.mostrarEstado();

        ventilador.subirVelocidad();
        System.out.print("DESPUÉS DE SUBIR A NIVEL MÁXIMO: ");
        ventilador.mostrarEstado();

        ventilador.apagar();
        System.out.print("DESPUÉS DE APAGAR: ");
        ventilador.mostrarEstado();
    }
}
