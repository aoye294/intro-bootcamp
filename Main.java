import ejercicios.*;

public class Main{
    public static void main(String[] args){
        //Ejercicio 1
        int resultado = SumaConParametros.suma(20, 40, 60);
        System.out.println("La suma de los tres numeros es: "+resultado);

        //Ejercicio 2
        Coche coche = new Coche();

        coche.incrementar();

        System.out.println("Número de puertas : " +coche.num_puertas);
    }

}

