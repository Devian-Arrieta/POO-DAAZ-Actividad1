package Parte_J.Ejercicio58;

public class InventarioItem {

    public String nombre;
    public int cantidad;
    public double precioUnitario;

    public InventarioItem(String nombre, int cantidad, double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double calcularValorTotal() {
        return cantidad * precioUnitario;
    }

    public void mostrarResumen() {
        System.out.println(
            "INVENTARIO \n"+
            "Ítem: " + nombre + "\n"+
            "Cantidad: " + cantidad + "\n"+
            "Valor Total: $" + calcularValorTotal()
        );
    }
}


class Main {
    public static void main(String[] args) {

        InventarioItem item = new InventarioItem("Ventiladores", 10, 200000);
        item.mostrarResumen();
    }
}
