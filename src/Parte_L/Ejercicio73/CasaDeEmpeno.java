package Parte_L.Ejercicio73;

public class CasaDeEmpeno {

    public String nombre, direccion;
    public int articulosEmpenados;
    public double capital;

    public CasaDeEmpeno(String nombre, String direccion, int articulosEmpenados, double capital) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.articulosEmpenados = articulosEmpenados;
        this.capital = capital;
    }

    // Constructor Copia
    public CasaDeEmpeno(CasaDeEmpeno otra) {
        this.nombre = otra.nombre;
        this.direccion = otra.direccion;
        this.articulosEmpenados = otra.articulosEmpenados;
        this.capital = otra.capital;
    }

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
            "Capital disponible: $" + capital +"\n"
        );
    }
}


class Main3 {
    public static void main(String[] args) {

        CasaDeEmpeno negocio1 = new CasaDeEmpeno("Empeños El Oro", "Centro Calle 32 #5-12", 10, 5000000);
        CasaDeEmpeno negocio2 = new CasaDeEmpeno("PrestaFácil", "Av. Pedro de Heredia #45-10", 4, 1200000);
        CasaDeEmpeno negocio3 = new CasaDeEmpeno("Inversiones La Confianza", "Barrio Manga Calle 25", 20, 15000000);
        CasaDeEmpeno negocio4 = new CasaDeEmpeno("El Trébol Empeños", "Sector Bocagrande Cra 3", 2, 800000);
        CasaDeEmpeno negocio5 = new CasaDeEmpeno("Prester Express", "CC Los Ejecutivos Local 102", 15, 3500000);

        System.out.print("Negocio 1: ");
        negocio1.empenarArticulo("Consola PS5", 1500000);

        System.out.print("Negocio 2: ");
        negocio2.empenarArticulo("Televisor 55'", 800000);

        System.out.print("Negocio 3: ");
        negocio3.empenarArticulo("Cadena de Oro 18k", 3000000);

        System.out.print("Negocio 4: ");
        negocio4.empenarArticulo("Laptop Gamer", 1200000);

        System.out.print("Negocio 5: ");
        negocio5.empenarArticulo("Bicicleta Todoterreno", 400000);

        System.out.println("-----------------------------------");

        System.out.print("Negocio 1: ");
        negocio1.mostrarInfo();

        System.out.print("Negocio 2: ");
        negocio2.mostrarInfo();

        System.out.print("Negocio 3: ");
        negocio3.mostrarInfo();

        System.out.print("Negocio 4: ");
        negocio4.mostrarInfo();

        System.out.print("Negocio 5: ");
        negocio5.mostrarInfo();
    }
}