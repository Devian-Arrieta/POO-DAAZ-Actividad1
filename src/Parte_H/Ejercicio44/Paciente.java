package Parte_H.Ejercicio44;

public class Paciente {

    public String nombre, diagnostico;
    public int edad;

    public Paciente(String nombre, int edad, String diagnostico){
        this.nombre = nombre;
        this.edad = edad;
        this.diagnostico = diagnostico;
    }

    public void mostrarFichaMedica(){
        System.out.println(
            "FICHA MÉDICA DEL PACIENTE \n"+
            "Nombre: "+ nombre + "\n"+
            "Edad: " + edad + " años\n"+
            "Diagnóstico: " + diagnostico +"\n"
        );
    }
}

class Main {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente("Devian Arrieta", 19, "Gripa");

        paciente1.mostrarFichaMedica();

        /*
         Instanciar la clase Paciente y crear un paciente están íntimamente
         relacionados porque ocurren en el mismo instante, pero difieren en su enfoque:

         Instanciar la clase paciente ocurre cuando la máquina
         virtual de Java (JVM) procesa la sentencia 'new Paciente()' y utiliza la clase
         como molde para reservar un bloque de memoria RAM con la estructura definida

         Crear un paciente se refiere a la entidad, el resultado tangible
         en el programa, es decir un sujeto real con nombre, edad y diagnóstico

         Instanciar es el proceso de fabricación en memoria mientras que crear un
         objeto es el resultado terminado que ya existe dentro del software
         */
    }
}
