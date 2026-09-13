package Parte_J.Ejercicio51;

public class Rectangulo {

    public double base, altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void mostrarResultados() {
        System.out.println(
            "RESULTADOS DE CÁLCULOS DEL RECTÁNGULO \n" +
            "Base: " + base + "\n" +
            "Altura: " + altura + "\n" +
            "Área: " + calcularArea() + "\n" +
            "Perímetro: " + calcularPerimetro() + "\n"
        );
    }
}

class Main {
    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo(5, 3);

        rectangulo1.mostrarResultados();
    }
}
