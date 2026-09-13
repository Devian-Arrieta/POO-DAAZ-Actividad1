package Parte_J.Ejercicio52;

public class FacturaSimple {

    public String numero, cliente;
    public double valor;

    public FacturaSimple(String numero, String cliente, double valor) {
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    public void aplicarDescuento() {
        double descuento = valor * 0.10;
        valor = valor - descuento;
        System.out.println("Se ha aplicado un 10% de descuento ($" + descuento + ") a la factura N° " + numero);
    }

    public void mostrarFactura() {
        System.out.println(
            "DETALLE DE LA FACTURA \n" +
            "Número: " + numero + "\n" +
            "Cliente: " + cliente + "\n" +
            "Valor Total: $" + valor + "\n"
        );
    }
}


class Main {
    public static void main(String[] args) {

        FacturaSimple factura1 = new FacturaSimple("4321", "Roberto Martínez", 12000);

        factura1.mostrarFactura();

        factura1.aplicarDescuento();
        System.out.print("APLICADO DESCUENTO: ");
        factura1.mostrarFactura();
    }
}
