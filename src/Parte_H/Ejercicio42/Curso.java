package Parte_H.Ejercicio42;

public class Curso {

    public String nombre, codigo;
    public int creditos;

    public Curso(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public void mostrarInfo() {
        System.out.println(
            "INFORMACIÓN DEL CURSO \n"+
            "Nombre: " + nombre +"\n"+
            "Código: " + codigo +"\n"+
            "Créditos: " + creditos +"\n"
        );
    }
}


class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Programación Orientada a Objetos", "POO-101", 3);
        Curso curso2 = new Curso("Bases de Datos I", "BD-202", 4);

        System.out.print("CURSO 1: ");
        curso1.mostrarInfo();

        System.out.print("CURSO 2: ");
        curso2.mostrarInfo();

        /*
         Ambos objetos 'curso1' y 'curso2' pertenecen a la misma clase Curso porque
         comparten la misma estructura base, es decir los atributos nombre, codigo, creditos
         y los mismos comportamientos, es decir el metodo mostrarInfo

         La clase actúa como el molde o plantilla, ya que determina que tipo de información
         puede almacenar un curso y que acciones puede realizar

         La diferencia entre ellos radica en su estado, al usar la palabra 'new',
         Java reserva dos espacios independientes en la memoria RAM, permitiendo que 'curso1'
         guarde los valores de POO y 'curso2' guarde los valores de Bases de Datos
          sin que interfieran entre sí
         */
    }
}
