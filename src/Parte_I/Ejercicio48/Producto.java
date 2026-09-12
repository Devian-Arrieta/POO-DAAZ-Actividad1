package Parte_I.Ejercicio48;

/*
EJEMPLO DONDE SE CONFUNDEN ATRIBUTOS CON VARIABLES LOCALES (INVÁLIDO / ERROR LÓGICO)

public class Producto {
    public String nombre;
    public double precio;

    public void registrarProducto(String n, double p) {

        // Al anteponer el tipo de dato 'String' y 'double',
        // el programador está creando NUEVAS variables locales dentro del metodo
        // Los atributos 'nombre' y 'precio' de la clase nunca reciben los datos

        String nombre = n;
        double precio = p;
    }

    public void mostrarInfo() {
        System.out.println(
            "INFORMACIÓN DEL PRODUCTO\n" +
            "Nombre: " + nombre + "\n" +
            "Precio: $" + precio
        );
    }
}
*/

// EJEMPLO VÁLIDO CORREGIDO

public class Producto {
    String nombre;
    double precio;


    public Producto(String nombre, double precio) {

        // 'this.nombre' hace referencia explícita al atributo de la clase
        // 'nombre' sin 'this' hace referencia al parámetro local recibido

        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println(
            "INFORMACIÓN DEL PRODUCTO\n" +
            "Nombre: " + nombre + "\n" +
            "Precio: $" + precio
        );
    }
}

class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Teclado", 150000);

        producto1.mostrarInfo();
    }
}