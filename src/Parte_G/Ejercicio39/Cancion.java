package Parte_G.Ejercicio39;

public class Cancion {

    public String titulo, artista, duracion;

    public Cancion(String titulo, String artista, String duracion){
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    public void mostrarInfo(){
        System.out.println(
            "INFORMACIÓN DE LA CANCIÓN \n"+
            "Titulo: "+ titulo +"\n"+
            "Artista: "+ artista +"\n"+
            "Duración: "+ duracion +"\n"
        );
    }
}

class Main {
    public static void main(String[] args) {

        Cancion cancion = new Cancion("PILOT", "Tyler, The Creator", "3:30 min");

        cancion.mostrarInfo();
    }
}