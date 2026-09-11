package Parte_F.Ejercicio29;

public class Estudiante {

    public String nombre, codigo, semestre;

    public Estudiante(){

    }

    public Estudiante(String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Estudiante(String nombre, String codigo, String semestre){
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

    }
}
