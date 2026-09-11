package Parte_F.Ejercicio32;

public class Producto {

    public String nombre;
    public double precio;
    public int stock;

    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    static Producto crearProductoBasico(String nombre, double precio, int stock){
        return new Producto(nombre, precio, stock);
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
    public static void main(String[] args){

        Producto producto1 = Producto.crearProductoBasico("Pan tajado", 8000, 20);

        Producto producto2 = Producto.crearProductoBasico("Cartón de huevos", 12000, 60);

        System.out.print("PRODUCTO 1: ");
        producto1.mostrarProducto();

        System.out.print("PRODUCTO 2: ");
        producto2.mostrarProducto();
    }
}