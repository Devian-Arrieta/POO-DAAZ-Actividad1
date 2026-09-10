package Parte_C.Ejercicio18;

public class Mascota {

    String nombre, especie;
    int edad;

    public void mostrarMascota(){
        System.out.println(
            "INFORMACIÓN DE LA MASCOTA \n" +
            "Nombre: "+ nombre +"\n"+
            "Especie: "+ especie +"\n"+
            "Edad: "+ edad +"\n"
        );
    }

    public void cumplirAnios(){
        edad += 1;
    }
}

class Main{
    public static void main(String[] args) {

        Mascota mascota = new Mascota();

        mascota.nombre = "Rio";
        mascota.especie = "rockwailer";
        mascota. edad = 1;

        mascota.mostrarMascota();

        mascota.cumplirAnios();
        System.out.println("MASCOTA CUMPLIÓ AÑOS");
        mascota.mostrarMascota();
    }
}