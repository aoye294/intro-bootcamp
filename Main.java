import tema3.*;
import tema4.*;
import tema8.*;
import tema9.*;

// Interfaces

interface Vehiculo {
    public void Acelerar(int countVelocity);

    public void Frenar(int countVelocity);
}

public class Main {
    public static void main(String[] args){
        //Ejercicio 1
        // int resultado = SumaConParametros.suma(20, 40, 60);
        // System.out.println("La suma de los tres numeros es: "+resultado);

        //Ejercicio 2
        // Coche coche = new Coche();
        // coche.incrementar();
        // System.out.println("Número de puertas : " +coche.num_puertas);

        //Ejercicio 3
        // Ejercicio sentencias = new Ejercicio();

        // //IF
        // sentencias.condicionalIf(0);

        // //While
        // sentencias.bucleWhile(0);

        // //Do While
        // sentencias.bucleDoWhile(2);

        // //For
        // sentencias.bucleFor(0);

        // //Switch
        // sentencias.bucleSwitch(6);

        // Ejercicio 4

        // Persona persona = new Persona();
        // persona.setNombre("Amalio Osá Oye");
        // persona.setEdad(21);
        // persona.setTelefono(691668250);

        // System.out.println(
        //     "Nombre: "+persona.getNombre()+"\n"+
        //     "Edad: " +persona.getEdad() + "\n"+
        //     "Teléfono: " + persona.getTelefono());

        // Ejercicio 5
        Cliente cliente = new Cliente();
        cliente.setNombre("Amalio Osá Oye");
        cliente.setEdad(21);
        cliente.setTelefono(691668250);
        cliente.setCredito(1500000);

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Amalio Osá Oye");
        trabajador.setEdad(22);
        trabajador.setTelefono(691668250);
        trabajador.setSalario(5500000);

        System.out.println(
            "\t ***** CLIENTE *****\n"+
            "Nombre: "+cliente.getNombre()+"\n"+
            "Edad: " +cliente.getEdad() + "\n"+
            "Teléfono: " + cliente.getTelefono()+ "\n"+
            "Crédito: " + cliente.getCredito());

        System.out.println("\n");
        System.out.println(
            "\t ***** TRABAJADOR ***** \n"+
            "Nombre: "+trabajador.getNombre()+"\n"+
            "Edad: " +trabajador.getEdad() + "\n"+
            "Teléfono: " + trabajador.getTelefono()+ "\n"+
            "Crédito: " + trabajador.getSalario());
    }

}

// class Coche implements Vehiculo{

// @Override
// public void Acelerar(int countVelocity){
// System.out.println();
// }
// @Override
// public void Frenar(int countVelocity){

// }

// }
