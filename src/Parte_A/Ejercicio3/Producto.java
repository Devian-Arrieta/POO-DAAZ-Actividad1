package Parte_A.Ejercicio3;

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
