package Parte_G.Ejercicio37;

import Parte_G.Ejercicio36.Puerta;

public class Celular {

    public String marca;
    public int bateria;
    public boolean prendido = false;

    public Celular(String marca, int bateria){

        if(bateria > 100 || bateria < 0){
            bateria = 100;
        }
        this.marca = marca;
        this.bateria = bateria;
    }

    public void encender(){
        prendido = true;
    }

    public void apagar(){
        prendido = false;
    }

    public void cargarBateria(){
        bateria = 100;
    }

    public void mostrarEstado(){

        String estado;

        if (prendido == true){
            estado = "encendido";
        }
        else{
            estado = "apagado";
        }

        System.out.println(
            "ESTADO DEL CELULAR  \n"+
            "Marca: "+ marca +"\n"+
            "Batería: "+ bateria +"\n"+
            "Estado: "+ estado +"\n"
        );
    }
}

class Main{
    public static void main(String[] args){

        Celular celular = new Celular("Samsung", 57);

        celular.mostrarEstado();

        celular.encender();
        System.out.print("ESTADO NUEVO 1: ");
        celular.mostrarEstado();

        celular.cargarBateria();
        System.out.print("ESTADO NUEVO 2: ");
        celular.mostrarEstado();
    }
}