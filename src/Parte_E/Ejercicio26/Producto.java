package Parte_E.Ejercicio26;

public class Producto {

    String nombre;
    double precio;
    int stock;

    public Producto(){

    }

    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

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

        // instancia con el constructor vacio
        Producto producto1 = new Producto();
        producto1.nombre = "Pan tajado";
        producto1.precio = 8000;
        producto1.stock = 20;

        // instancia con el constructor parametrizado
        Producto producto2 = new Producto("Cartón de huevos", 12000, 60);

        System.out.print("PRODUCTO 1: ");
        producto1.mostrarProducto();

        System.out.print("PRODUCTO 2: ");
        producto2.mostrarProducto();
    }
}