package Parte_J.Ejercicio54;

public class Semaforo {

    String colorActual;

    public Semaforo(String colorInicial) {
        this.colorActual = colorInicial;
    }

    public void cambiarColor(String nuevoColor) {
        if (nuevoColor.equalsIgnoreCase("Rojo") ||
                nuevoColor.equalsIgnoreCase("Amarillo") ||
                nuevoColor.equalsIgnoreCase("Verde")) {

            this.colorActual = nuevoColor;
        }
        else { // valida que el cambio de color del semaforo sean los colores correctos
            System.out.println("Error: '" + nuevoColor + "' no es un color válido");
        }
    }

    public void mostrarEstado() {
        System.out.println("Semáforo en: " + colorActual);
    }
}

class Main {
    public static void main(String[] args) {

        Semaforo semaforo = new Semaforo("Rojo");
        semaforo.mostrarEstado();

        semaforo.cambiarColor("Verde");
        semaforo.mostrarEstado();

        semaforo.cambiarColor("Azul");
        semaforo.mostrarEstado();
    }
}
