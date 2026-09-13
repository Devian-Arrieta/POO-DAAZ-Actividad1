package Parte_K.Ejercicio61;

/*
    DISEÑO PREVIO PARA LA CLASE DOCENTE

     - ATRIBUTOS (Características de la entidad):
        nombre (String): Nombre completo del profesor
        asignatura (String): Materia que da
        experienciaAnios (int): Años de experiencia en la docencia

    - MÉTODOS (Comportamientos):
        ensenar(): Simula la acción de dar clase
        mostrarInfo(): Muestra la información del docente

    - OBJETOS REALES QUE PODRÍAN CONSTRUIRSE:
        Docente 1: "John Arrieta", "POO", 10 años
        Docente 2: "Carlos Caceres", "POO", 12 años
*/

public class Docente {

    public String nombre, asignatura;
    public int experienciaAnios;

    public Docente(String nombre, String asignatura, int experienciaAnios) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.experienciaAnios = experienciaAnios;
    }

    public void ensenar() {
        System.out.println(nombre + " está dando la asignatura de " + asignatura );
    }

    public void mostrarInfo() {
        System.out.println(
            "INFORMACIÓN DEL DOCENTE \n"+
            "Docente: " + nombre + "\n"+
            "Asignatura: " + asignatura + "\n"+
            "Experiencia: " + experienciaAnios + " años" +"\n"
        );
    }
}


class Main {
    public static void main(String[] args) {

        Docente docente1 = new Docente("John Arrieta", "POO", 10);

        docente1.mostrarInfo();
        docente1.ensenar();
    }
}