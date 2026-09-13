package Parte_J.Ejercicio55;

public class Reloj {

    int hora, minuto, segundo;

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void mostrarHora() {
        System.out.println("Hora actual: " + hora + ":" + minuto + ":" + segundo);
    }
}


class Main {
    public static void main(String[] args) {

        Reloj reloj1 = new Reloj(10, 35, 20);
        reloj1.mostrarHora();
    }
}
