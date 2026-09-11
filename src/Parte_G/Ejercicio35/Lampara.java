package Parte_G.Ejercicio35;

public class Lampara {

    public String marca;
    public boolean encendida = false;

    public Lampara(String marca){
        this.marca = marca;
    }

    public void encendido(){
        encendida = true;
    }

    public void apagado(){
        encendida = false;
    }

    public void mostrarEstado(){

        String estado;

        if (encendida == true){
            estado = "Encendido";
        }
        else{
            estado = "Apagado";
        }

        System.out.println(
            "ESTADO DE LA LÁMPARA \n"+
            "Marca: "+ marca +"\n"+
            "Estado: "+ estado +"\n"
        );
    }
}

class Main{
    public static void main(String[] args){

        Lampara lampara1 = new Lampara("Samsung");

        lampara1.mostrarEstado();

        lampara1.encendido();

        System.out.print("NUEVO ESTADO: ");
        lampara1.mostrarEstado();
    }
}