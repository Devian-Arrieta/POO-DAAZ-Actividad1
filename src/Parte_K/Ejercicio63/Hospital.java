package Parte_K.Ejercicio63;

/*
    DISEÑO PREVIO DE LA CLASE HOSPITAL

    - ATRIBUTOS (Características de la entidad):
        nombre (String): Nombre de la institución
        ciudad (String): Ciudad donde se encuentra ubicado
        camasDisponibles (int): Cantidad de camas libres para internación

    - MÉTODOS (Comportamientos):
        ingresarPaciente(): Reduce en 1 la cantidad de camas disponibles
        mostrarInfo(): Despliega el estado general del hospital

    - OBJETOS REALES QUE PODRÍAN CONSTRUIRSE:
        Hospital 1: "Hospital Bocagrande", "Cartagena", 15
        Hospital 2: "Hospital Universitario", "Cartagena", 40
*/

public class Hospital {

    public String nombre, ciudad;
    public int camasDisponibles;

    public Hospital(String nombre, String ciudad, int camasDisponibles) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.camasDisponibles = camasDisponibles;
    }

    public void ingresarPaciente() {
        if (camasDisponibles > 0) {
            camasDisponibles--;
            System.out.println("Paciente ingresado en " + nombre + ". Camas restantes: " + camasDisponibles);
        } else {
            System.out.println("Sin camas disponibles en " + nombre);
        }
    }

    public void mostrarInfo() {
        System.out.println(
            "INFORMACIÓN DEL HOSPITAL \n"+
            "Hospital: " + nombre + "\n"+
            "Ciudad: " + ciudad + "\n"+
            "Camas libres: " + camasDisponibles +"\n"
        );
    }
}


class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("Hospital Bocagrande", "Cartagena", 15);

        hospital.mostrarInfo();
        hospital.ingresarPaciente();
        hospital.mostrarInfo();
    }
}