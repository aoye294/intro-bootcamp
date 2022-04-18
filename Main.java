import tema3.*;
import tema4.*;
import tema8.*;

public class Main{
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

        Persona persona = new Persona();
        persona.setNombre("Amalio Osá Oye");
        persona.setEdad(21);
        persona.setTelefono(691668250);

        System.out.println(
            "Nombre: "+persona.getNombre()+"\n"+
            "Edad: " +persona.getEdad() + "\n"+
            "Teléfono: " + persona.getTelefono());

    }

}

