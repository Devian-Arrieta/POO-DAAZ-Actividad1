package Parte_J.Ejercicio56;

public class Temperatura {

    public double celsius;

    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    public double fahrenheit() {
        return (celsius * 1.8) + 32;
    }

    public void mostrarConversion() {
        System.out.println(celsius + " °C equivalen a " + fahrenheit() + " °F");
    }
}


class Main {
    public static void main(String[] args) {

        Temperatura temp = new Temperatura(25.0);
        temp.mostrarConversion();
    }
}
