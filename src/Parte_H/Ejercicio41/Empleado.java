package Parte_H.Ejercicio41;

public class Empleado {

    public String nombre, cargo;
    public double salario;

    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void mostrarInfo() {
        System.out.println(
            "INFORMACIÓN DEL EMPLEADO \n"+
            "Nombre: "+ nombre + "\n"+
            "Cargo: "+ cargo + "\n"+
            "Salario: $"+ salario + "\n"
        );
    }
}

class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Devian Arrieta", "Desarrollador", 3500000);
        Empleado empleado2 = new Empleado("Laura Gómez", "Diseñadora UX", 3000000);

        System.out.print("EMPLEADO 1: ");
        empleado1.mostrarInfo();

        System.out.print("EMPLEADO 2: ");
        empleado2.mostrarInfo();

        /*
         Modelar a un empleado mediante una clase en POO es más fácil y rápido y menos repetitivo que usar
         variables sueltas (programación procedural) porque encapsula tanto los datos
         nombre, cargo, salario como sus comportamientos mostrarInfo, calcularSalarioAnual
         en un solo molde de manera coherente

         De manera procedural o lineal con variables sueltas por cada empleado
         si el sistema crece a 100 empleados tendríamos 300 variables dispersas en memoria
         aumentando el riesgo de desasociar los datos o cometer errores al pasarlos
         a otras funciones

         La POO nos garantiza orden, escalabilidad, mantenibilidad y la posibilidad de reutilizar la
         plantilla para crear N empleados independientes con una sola línea de código
         */
    }
}
