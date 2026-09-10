package Parte_A.Ejercicio2;

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
