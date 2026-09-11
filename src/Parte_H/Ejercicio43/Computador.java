package Parte_H.Ejercicio43;

public class Computador {

    public String marca, almacenamiento,RAM;

    public Computador(String marca, String almacenamiento, String RAM){

        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.RAM = RAM;
    }

    public void mostrarInfo() {
        System.out.println(
            "INFORMACIÓN DEL COMPUTADOR \n"+
                "Marca: " + marca +"\n"+
                "Almacenamiento: " + almacenamiento +"\n"+
                "Memoria RAM: " + RAM +"\n"
        );
    }
}

class Main {
    public static void main(String[] args) {

        Computador pc1 = new Computador("Lenovo", "256 GB", "16 GB");
        Computador pc2 = new Computador("Asus", "128 GB", "8 GB");

        System.out.println("COMPUTADOR 1: ");
        pc1.mostrarInfo();

        System.out.println("COMPUTADOR 2: ");
        pc2.mostrarInfo();

        /*
         La clase Computador es solo una abstracción en el código ya que no representa ningún
         computador fisicamente ni ocupa espacio en la memoria para almacenar datos de usuario,
         este solo especifica los atributos, como que todo computador en este programa debe tener marca,
         almacenamiento y memoria RAM y que es capaz de mostrar sus especificaciones

         Los objetos pc1 y pc2 son la entidad real nacida en tiempo de ejecución mediante la palabra 'new'
         que a diferencia de la clase, aquí sí ocupa un espacio real en la memoria y posee datos
         reales y medibles
         */
    }
}
