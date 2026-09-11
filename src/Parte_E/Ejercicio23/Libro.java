package Parte_E.Ejercicio23;

public class Libro {
    
    String titulo, autor;
    int paginas;

    public Libro(){ // Constructor vacio

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

        Libro libro = new Libro();
        libro.titulo = "Las Crónicas de Narnia";
        libro.autor = "C.S. Lewis";
        libro.paginas = 768;

        libro.mostrarInfo();
    }
}