package Parte_C.Ejercicio12;

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

    public void frenar(){
        velocidadActual -= 10;

        if (velocidadActual < 0){
            velocidadActual = 0;
        }
    }
}

class Main{
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.marca = "Renault";
        vehiculo1.modelo = "Duster";
        vehiculo1.velocidadActual = 80;

        vehiculo1.mostrarEstado();

        vehiculo1.frenar();
        System.out.print("VEHICULO FRENANDO: ");
        vehiculo1.mostrarEstado();
    }
}