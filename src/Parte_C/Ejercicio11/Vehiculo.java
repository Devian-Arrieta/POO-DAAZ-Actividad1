package Parte_C.Ejercicio11;

public class Vehiculo {

    String marca, modelo;
    double velocidadActual;

    public void mostrarEstado(){
        System.out.println(
            "ESTADO DEL VEHICULO \n" +
            "Marca: "+ marca +"\n"+
            "modelo: "+ modelo +"\n"+
            "Velocidad Actual: "+ velocidadActual +"\n"
        );
    }

    public void acelerar(){
        velocidadActual += 10;
    }
}

class Main{
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.marca = "Toyota";
        vehiculo1.modelo = "Corolla";
        vehiculo1.velocidadActual = 0;

        vehiculo1.mostrarEstado();

        vehiculo1.acelerar();
        System.out.print("VEHICULO ACELERADO: ");
        vehiculo1.mostrarEstado();
    }
}