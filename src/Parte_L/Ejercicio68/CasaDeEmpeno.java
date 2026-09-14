package Parte_L.Ejercicio68;

public class CasaDeEmpeno {

    public String nombre, direccion;
    public int articulosEmpenados;
    public double capital;

    public void empenarArticulo(String articulo, double valorPrestamo) {

        if (capital >= valorPrestamo) {
            this.capital -= valorPrestamo;
            this.articulosEmpenados++;
            System.out.println("Se recibió '" + articulo + "' y se otorgó un préstamo de $" + valorPrestamo + ".");
        } 
        else {
            System.out.println("Capital insuficiente en " + nombre + " para prestar $" + valorPrestamo + " por: " + articulo + ".");
        }
    }

    public void mostrarInfo() {
        System.out.println(
            "INFORMACIÓN CASA DE EMPEÑO \n"+
            "Establecimiento: " + nombre + "\n"+
            "Dirección: " + direccion +"\n"+
            "Artículos en custodia: " + articulosEmpenados + "\n"+
            "Capital disponible: $" + capital
        );
    }
}
