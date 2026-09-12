package Parte_I.Ejercicio46;

/*
EJEMPLO DE CLASE SIN NOMBRE INVÁLIDO

public class { // Error porque falta el nombre (identificador) de la clase
    String marca;
    String modelo;

    public void mostrarInfo() {
        System.out.println(
            "Marca: " + marca + "\n" +
            "Modelo: " + modelo
        );
    }
}
*/

// EJEMPLO VÁLIDO CORREGIDO

public class Vehiculo { // Se agrega el identificador Vehiculo a la clase
    String marca;
    String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println(
            "Marca: " + marca + "\n" +
            "Modelo: " + modelo
        );
    }
}

class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla");

        vehiculo1.mostrarInfo();
    }
}