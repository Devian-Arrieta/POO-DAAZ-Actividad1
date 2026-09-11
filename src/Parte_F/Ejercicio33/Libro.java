package Parte_F.Ejercicio33;

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
