package Parte_B.Ejercicio8;

public class Producto {

    String nombre;
    double precio;
    int stock;

    public void mostrarProducto(){
        System.out.println(
            "INFORMACIÓN DEL PRODUCTO \n \n" +
            "Nombre: "+ nombre +"\n"+
            "Precio: "+ precio +"\n"+
            "Stock: "+ stock +"\n"
        );
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

        System.out.print("PRODUCTO 1: ");
        producto1.mostrarProducto();

        System.out.print("PRODUCTO 2: ");
        producto2.mostrarProducto();

        System.out.print("PRODUCTO 3: ");
        producto3.mostrarProducto();
    }
}