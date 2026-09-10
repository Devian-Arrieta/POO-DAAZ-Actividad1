package Parte_B.Ejercicio9;

public class Mascota {

    String nombre, especie;
    int edad;

    public void mostrarMascota(){
        System.out.println(
            "INFORMACIÓN DE LA MASCOTA \n \n" +
            "Nombre: "+ nombre +"\n"+
            "Especie: "+ especie +"\n"+
            "Edad: "+ edad +"\n"
        );
    }
}

class Main{
    public static void main(String[] args) {

        Mascota mascota = new Mascota();

        mascota.nombre = "Rio";
        mascota.especie = "rockwailer";
        mascota. edad = 1;

        mascota.mostrarMascota();

        mascota.edad = 3; // edad actualizada

        System.out.println("EDAD DE MASCOTA ACTUALIZADA");
        mascota.mostrarMascota();
    }
}