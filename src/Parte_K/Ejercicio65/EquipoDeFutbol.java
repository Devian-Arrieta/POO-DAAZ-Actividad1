package Parte_K.Ejercicio65;

/*
    DISEÑO PREVIO DE LA CLASE EQUIPODEFUTBOL

    - ATRIBUTOS (Características de la entidad):
        nombre (String): Nombre del club deportivo
        ciudad (String): Ciudad de origen o sede
        puntos (int): Puntos acumulados en el torneo

    - MÉTODOS (Comportamientos):
        ganarPartido(): Incrementa en 3 los puntos acumulados del equipo
        mostrarInfo(): Despliega la información básica y el puntaje actual

    - OBJETOS REALES QUE PODRÍAN CONSTRUIRSE:
        Equipo 1: "Real Madrid", "Madrid"
        Equipo 2: "Junior de Barranquilla", "Barranquilla"
*/

public class EquipoDeFutbol {

    public String nombre, ciudad;
    int puntos = 0;

    public EquipoDeFutbol(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public void ganarPartido() {
        this.puntos += 3;
        System.out.println(nombre + " ganó el partido y suma 3 puntos");
    }

    public void mostrarInfo() {
        System.out.println(
            "INFORMACIÓN DEL EQUIPO DE FUTBOL \n"+
            "Equipo: " + nombre + "\n"+
            "Ciudad: " + ciudad + "\n"+
            "Puntos: " + puntos +"\n"
        );
    }
}


class Main {
    public static void main(String[] args) {

        EquipoDeFutbol equipo = new EquipoDeFutbol("Junior de Barranquilla", "Barranquilla");

        equipo.mostrarInfo();
        equipo.ganarPartido();
        equipo.mostrarInfo();
    }
}