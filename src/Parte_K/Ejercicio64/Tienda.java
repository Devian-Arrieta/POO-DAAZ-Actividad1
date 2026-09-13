package Parte_K.Ejercicio64;

/*
    DISEÑO PREVIO DE LA CLASE TIENDA

    - ATRIBUTOS (Características de la entidad):
        nombre (String): Nombre del establecimiento comercial
        direccion (String): Ubicación del local
        ventasTotales (double): Acumulado de dinero por ventas

    - MÉTODOS (Comportamientos):
        registrarVenta(double monto): Suma una venta al acumulado de la tienda
        mostrarInfo(): Despliega el resumen de datos de la tienda

    - OBJETOS REALES QUE PODRÍAN CONSTRUIRSE:
        Tienda 1: "Tienda San José", "Calle 30 # 15-20"
        Tienda 2: "Supermercado El Sol", "Av. Principal # 45"
*/

public class Tienda {

    public String nombre, direccion;
    public double ventasTotales = 0;

    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ventasTotales = ventasTotales;
    }

    public void registrarVenta(double monto) {
        this.ventasTotales += monto;
        System.out.println("Venta registrada por $" + monto + " en " + nombre);
    }

    public void mostrarInfo() {
        System.out.println("INFORMACIÓN DE LA CUENTA \n"+
        "Tienda: " + nombre + "\n"+
        "Dirección: " + direccion + "\n"+
        "Ventas Totales: $" + ventasTotales +"\n"
        );
    }
}


class Main {
    public static void main(String[] args) {

        Tienda tienda = new Tienda("Tienda San José", "Calle 30 # 15-20");

        tienda.mostrarInfo();
        tienda.registrarVenta(45000);
        tienda.mostrarInfo();
    }
}