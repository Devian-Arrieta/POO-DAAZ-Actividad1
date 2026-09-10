package Parte_D.Ejercicio20;

public class Producto {

    String nombre;
    double precio;
    int stock;

    public void mostrarProducto(){
        System.out.println(
            "INFORMACIÓN DEL PRODUCTO \n" +
            "Nombre: "+ nombre +"\n"+
            "Precio: "+ precio +"\n"+
            "Stock: "+ stock +"\n"
        );
    }

    public void vender(int cantidad){

        if (cantidad > stock){
            System.out.println("La cantidad de productos a vender es mayor a lo disponible en el stock");
        }
        else{
            stock -= cantidad;
            System.out.println("Producto vendido correctamente");
        }
    }

    public void reabastecer(int cantidad){
        stock += cantidad;
    }
}

class Main{
    public static void main(String[] args) {

        Producto producto1 = new Producto();
        producto1.nombre = "Pan tajado";
        producto1.precio = 8000;
        producto1.stock = 20;

        Producto producto2 = new Producto();
        producto2.nombre = "Cartón de huevos";
        producto2.precio = 12000;
        producto2.stock = 60;

        Producto producto3 = new Producto();
        producto3.nombre = "Bolsa de tomates";
        producto3.precio = 5000;
        producto3.stock = 30;

        /*
        Los 3 objetos anteriores comparte:
        - La misma plantilla, es decir, la clase Producto
        - Los mismos atributos de la clase (nombre, precio, stock)
        - Los mismos métodos o comportamientos (mostrarProducto)
        */

        System.out.print("PRODUCTO 1: ");
        producto1.mostrarProducto();

        System.out.print("PRODUCTO 2: ");
        producto2.mostrarProducto();

        System.out.print("PRODUCTO 3: ");
        producto3.mostrarProducto();

        /*
        Pero se diferencian en que:
        Cada uno tiene valores diferentes, comparten la misma plantilla o caracteristicas,
        pero son diferentes en cuanto información o contenido cada uno,
        la palabra 'new' asigna una dirección de memoria distinta para cada una de
        las 3 instancias o objetos
        */

    }
}