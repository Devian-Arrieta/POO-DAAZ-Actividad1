package Parte_J.Ejercicio60;

public class Avion {

    public String aerolinea, destino;
    public int pasajeros;

    public Avion(String aerolinea, String destino, int pasajeros) {
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.pasajeros = pasajeros;
    }

    public void abordar(int cantidad) {
        this.pasajeros += cantidad;
        System.out.println("Han abordado " + cantidad + " pasajeros.");
    }

    public void mostrarEstado() {
        System.out.println(
            "ESTADO AVIÓN \n"+
            "Aerolínea: " + aerolinea + "\n"+
            "Destino: " + destino + "\n"+
            "Pasajeros a bordo: " + pasajeros +"\n"
        );
    }
}


class Main {
    public static void main(String[] args) {

        Avion avion = new Avion("Avianca", "Bogotá", 120);

        avion.mostrarEstado();
        avion.abordar(15);
        avion.mostrarEstado();
    }
}