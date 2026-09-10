package Parte_D.Ejercicio21;

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

        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Rio";
        mascota1.especie = "Perro";
        mascota1.edad = 1;

        Mascota mascota2 = new Mascota();
        mascota2.nombre = "REY";
        mascota2.especie = "Perro";
        mascota2.edad = 7;

        /*
        Se crearon 2 objetos en base a la clase Mascota, ambos comparten el mismo
        atributo de especie en ser perros, pero, los demás atributos nombre y edad
        son diferentes
        */

        System.out.println("MASCOTA 1: ");
        mascota1.mostrarMascota();

        System.out.println("MASCOTA 2: ");
        mascota2.mostrarMascota();
    }
}