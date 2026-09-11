package Parte_E.Ejercicio25;

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

        // Instancia con el constructor vacio
        Libro libro1 = new Libro();
        libro1.titulo = "Las Crónicas de Narnia";
        libro1.autor = "C.S. Lewis";
        libro1.paginas = 768;

        // Instancia con el constructor parametrizado
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Marquez", 496);

        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }
}