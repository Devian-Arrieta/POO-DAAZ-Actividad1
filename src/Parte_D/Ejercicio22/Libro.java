package Parte_D.Ejercicio22;

public class Libro {
    
    String titulo, autor;
    int paginas;
    
    public void mostrarInfo(){
        System.out.println(
            "INFORMACIÓN DEL LIBRO \n" +
            "Titulo: "+ titulo +"\n"+
            "Autor: "+ autor +"\n"+
            "Páginas: "+ paginas +"\n"
        );
    }
}

class Main{
    public static void main(String[] args){

        Libro libro1 = new Libro();
        libro1.titulo = "Cien Años de Soledad";
        libro1.autor = "Gabriel García Márquez";
        libro1.paginas = 496;

        Libro libro2 = new Libro();
        libro2.titulo = "Las Crónicas de Narnia";
        libro2.autor = "C.S. Lewis";
        libro2.paginas = 768;

        Libro libro3 = new Libro();
        libro3.titulo = "Juan Salvador Gaviota";
        libro3.autor = "Richard Bach";
        libro3.paginas = 112;

        Libro libro4 = new Libro();
        libro4.titulo = "Crónica De Una Muerte Anunciada";
        libro4.autor = "Gabriel García Márquez";
        libro4.paginas = 140;

        System.out.print("LIBRO 1: ");
        libro1.mostrarInfo();

        System.out.print("LIBRO 2: ");
        libro2.mostrarInfo();

        System.out.print("LIBRO 3: ");
        libro3.mostrarInfo();

        System.out.print("LIBRO 4: ");
        libro4.mostrarInfo();

        /*
        La clase Libro es una plantilla porque únicamente define el modelo general, es decir,
        los atributos que tendrá cualquier libro y las acciones que puede realizar,
        sin contener datos reales aún

        Los objetos libro1, libro2, libro3 y libro4 ya son los casos concretos porque
        son instancias reales creadas en memoria mediante el operador 'new', donde cada
        una adquiere una identidad propia, aunque alguna puede que tengan el mismo atributo y
        almacena valores específicos
        */
    }
}