package Parte_F.Ejercicio31;

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
