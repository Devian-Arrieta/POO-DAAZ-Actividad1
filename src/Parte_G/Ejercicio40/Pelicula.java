package Parte_G.Ejercicio40;

public class Pelicula {

    public String nombre, genero, duracion;

    public Pelicula(String nombre, String genero, String duracion){
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
    }

    public void mostrarFicha(){
        System.out.println(
            "FICHA DE LA PELÍCULA \n"+
            "Nombre: "+ nombre +"\n"+
            "Genero: "+ genero + "\n"+
            "Duración: "+ duracion +"\n"
        );
    }
}

class Main {
    public static void main(String[] args) {

        Pelicula pelicula = new Pelicula("Maze Runner: Correr o morir", "Ciencia ficción distópica", "1:53:00 hr");

        pelicula.mostrarFicha();
    }
}