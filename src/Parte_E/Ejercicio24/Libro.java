package Parte_E.Ejercicio24;

public class Libro {
    
    String titulo, autor;
    int paginas;

    public Libro(){ // Constructor vacio

    }

    public Libro(String titulo, String autor, int paginas){ // Constructor parametrizado
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
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

    }
}