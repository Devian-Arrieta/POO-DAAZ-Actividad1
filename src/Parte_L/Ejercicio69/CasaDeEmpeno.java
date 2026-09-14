package Parte_L.Ejercicio69;

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
            "Capital disponible: $" + capital +"\n"
        );
    }
}


class Main3 {
    public static void main(String[] args) {

        CasaDeEmpeno negocio1 = new CasaDeEmpeno();
        negocio1.nombre = "Empaños El Oro";
        negocio1.direccion = "Centro Calle 32 #5-12";
        negocio1.articulosEmpenados = 10;
        negocio1.capital = 5000000;

        CasaDeEmpeno negocio2 = new CasaDeEmpeno();
        negocio2.nombre = "PrestaFácil";
        negocio2.direccion = "Av. Pedro de Heredia #45-10";
        negocio2.articulosEmpenados = 4;
        negocio2.capital = 1200000;

        CasaDeEmpeno negocio3 = new CasaDeEmpeno();
        negocio3.nombre = "Inversiones La Confianza";
        negocio3.direccion = "Barrio Manga Calle 25";
        negocio3.articulosEmpenados = 20;
        negocio3.capital = 15000000;

        CasaDeEmpeno negocio4 = new CasaDeEmpeno();
        negocio4.nombre = "El Trébol Empeños";
        negocio4.direccion = "Sector Bocagrande Cra 3";
        negocio4.articulosEmpenados = 2;
        negocio4.capital = 800000;

        CasaDeEmpeno negocio5 = new CasaDeEmpeno();
        negocio5.nombre = "Prester Express";
        negocio5.direccion = "CC Los Ejecutivos Local 102";
        negocio5.articulosEmpenados = 15;
        negocio5.capital = 3500000;

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