package Parte_F.Ejercicio34;

public class Libro {
    
    public String titulo, autor;
    public int paginas;

    public Libro(String titulo, String autor, int paginas){
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public Libro(Libro otro){ // Constructor copia
        this.titulo = otro.titulo;
        this.autor = otro.autor;
        this.paginas = otro.paginas;
    }

    public void mostrarInfo(){
        System.out.println(
            "INFORMACIÓN DEL LIBRO \n" +
            "Titulo: "+ titulo +"\n"+
            "Autor: "+ autor +"\n"+
            "Páginas: "+ paginas +"\n"
        );
    }
}


class Main {
    public static void main(String[] args) {

        // libro creado con el constructor original
        Libro libroOriginal = new Libro("El principito", "Antoine de Saint-Exupéry", 96);

        // libro con el constructor copia
        Libro libroCopia = new Libro(libroOriginal);

        System.out.print("LIBRO ORIGINAL: ");
        libroOriginal.mostrarInfo();

        System.out.print("LIBRO COPIA: ");
        libroCopia.mostrarInfo();
    }
}