package Parte_B.Ejercicio7;

public class Vehiculo {

    String marca, modelo, velocidadActual;

    public void mostrarEstado(){
        System.out.println(
            "ESTADO DEL VEHICULO \n \n" +
            "Marca: "+ marca +"\n"+
            "modelo: "+ modelo +"\n"+
            "Velocidad Actual: "+ velocidadActual +"\n"
        );
    }
}

class Main{
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.marca = "Toyota";
        vehiculo1.modelo = "Corolla";
        vehiculo1.velocidadActual = "0 km/h";

        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.marca = "Renault";
        vehiculo2.modelo = "Duster";
        vehiculo2.velocidadActual = "80 km/h";

        vehiculo1.mostrarEstado();
        vehiculo2.mostrarEstado();
    }
}