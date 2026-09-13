package Parte_J.Ejercicio53;

public class Reserva {

    public String nombreCliente, fecha;
    public boolean activa = false;

    public Reserva(String nombreCliente, String fecha){
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
    }

    public void confirmar() {
        this.activa = true;
        System.out.println("La reserva a nombre de "+ nombreCliente +" para el "+ fecha + "ha sido CONFIRMADA");
    }

    public void cancelar() {
        this.activa = false;
        System.out.println("La reserva a nombre de "+ nombreCliente +" para el "+ fecha +" ha sido CANCELADA");
    }

    public void mostrarEstado() {

        String estado;

        if(activa == true){
            estado = "Confirmada";
        }
        else{
            estado = "Inactiva y/o cancelada";
        }

        System.out.println(
            "DETALLES DE LA RESERVA \n" +
            "Cliente: " + nombreCliente + "\n" +
            "Fecha: " + fecha + "\n" +
            "Estado: " + estado + "\n"
        );
    }
}

class Main {
    public static void main(String[] args) {

        Reserva reserva1 = new Reserva("Devian Arrieta", "15 de Octubre");

        reserva1.mostrarEstado();

        reserva1.confirmar();
        System.out.print("RESERVADO: ");
        reserva1.mostrarEstado();

        reserva1.cancelar();
        System.out.print("CANCELADO: ");
        reserva1.mostrarEstado();
    }
}