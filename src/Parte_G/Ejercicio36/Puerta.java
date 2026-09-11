package Parte_G.Ejercicio36;

import Parte_G.Ejercicio35.Lampara;

public class Puerta {

    public String material;
    public boolean abierta = false;

    public Puerta(String material){
        this.material = material;
    }

    public void abrir(){
        abierta = true;
    }

    public void cerrar(){
        abierta = false;
    }

    public void mostrarEstado(){

        String estado;

        if (abierta == true){
            estado = "Abierta";
        }
        else{
            estado = "Cerrado";
        }

        System.out.println(
            "ESTADO DE LA PUERTA \n"+
            "Material: "+ material +"\n"+
            "Estado: "+ estado +"\n"
        );
    }
}

class Main{
    public static void main(String[] args){

        Puerta puerta = new Puerta("madera");

        puerta.mostrarEstado();

        puerta.abrir();

        System.out.print("NUEVO ESTADO: ");
        puerta.mostrarEstado();
    }
}