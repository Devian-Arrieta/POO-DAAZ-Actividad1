package Parte_F.Ejercicio30;

public class Estudiante {

    public String nombre, codigo, semestre;

    public Estudiante(){ // constructor 1

    }
    
    public Estudiante(String nombre, String codigo){ // Constructor 2
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Estudiante(String nombre, String codigo, String semestre){ // constructor 3
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    public void mostrarInfo(){
        System.out.println(
            "INFORMACIÓN DEL ESTUDIANTE \n" +
            "Nombre: "+ nombre +"\n"+
            "Código: "+ codigo +"\n"+
            "Semestre: "+ semestre +"\n"
        );
    }

    public void cambiarSemestre(String nuevoSemestre){
        semestre = nuevoSemestre;
    }
}

class Main {
    public static void main(String[] args) {

        // instancia del constructor 1
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Devian Arrieta";
        estudiante1.codigo = "7502610036";
        estudiante1.semestre = "2 semestre";

        // instancia del constructor 1
        Estudiante estudiante2 = new Estudiante("Roberto Martinez", "7502610041");
        estudiante2.semestre = "2 semestre";

        // instancia del constructor 1
        Estudiante estudiante3 = new Estudiante("Pepito Perez", "7502610099", "1 semestre");
    }
}
