package Parte_K.Ejercicio62;

/*
    DISEÑO PREVIO DE LA CLASE BIBLIOTECA

    - ATRIBUTOS (Características de la entidad):
        nombre (String): Nombre de la biblioteca
        direccion (String): Ubicación de la biblioteca
        cantidadLibros (int): Total de libros disponibles en catálogo

    - MÉTODOS (Comportamientos):
        prestarLibro(): Disminuye en 1 la cantidad de libros disponibles
        mostrarInfo(): Muestra el estado y datos de la biblioteca

    - OBJETOS REALES QUE PODRÍAN CONSTRUIRSE:
        Biblioteca 1: "Biblioteca Luis Ángel Arango", "Calle 11 # 4-14", 50000
        Biblioteca 2: "Biblioteca Bartolomé Calvo", "Centro Histórico", 15000
*/

public class Biblioteca {

    public String nombre, direccion;
    public int cantidadLibros;

    public Biblioteca(String nombre, String direccion, int cantidadLibros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadLibros = cantidadLibros;
    }

    public void prestarLibro() {
        if (cantidadLibros > 0) {
            cantidadLibros--;
            System.out.println("Se prestó 1 libro de la biblioteca " + nombre );
        } else {
            System.out.println("No hay libros disponibles");
        }
    }

    public void mostrarInfo() {
        System.out.println(
            "INFORMACIÓN DE LA BIBLIOTECA \n"+
            "Biblioteca: " + nombre + "\n"+
            "Dirección: " + direccion + "\n"+
            "Libros en inventario: " + cantidadLibros +"\n"
        );
    }
}


class Main {
    public static void main(String[] args) {

        Biblioteca biblio = new Biblioteca("Biblioteca Bartolomé Calvo", "Centro Histórico", 15000);

        biblio.mostrarInfo();
        biblio.prestarLibro();
        biblio.mostrarInfo();
    }
}