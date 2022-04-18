package tema4;

public class Ejercicio {

    // IF
    public void condicionalIf(int value) {
        String resultado;
        if (value > 0) {
            resultado = value + " es un numero POSITIVO";
        } else if (value < 0) {
            resultado = value + " es un numero NEGATIVO";
        } else {
            resultado = value + " es un CERO";
        }
        System.out.println(resultado);
    }

    // WHILE
    public void bucleWhile(int valueWhile) {
        while (valueWhile < 3) {
            valueWhile++;
            System.out.println("Valor: " + valueWhile);
        }
    }

    // DO WHILE
    public void bucleDoWhile(int valueDoWhile) {
        do {
            System.out.println("Una vez: " + valueDoWhile);
            break;
        } while (valueDoWhile < 3);
    }

    // DO WHILE
    public void bucleFor(int valueFor) {
        for (valueFor = 0; valueFor <= 3; valueFor++) {
            System.out.println(valueFor);
        }
    }

    // SWITCH
    public void bucleSwitch(int estacion) {
        switch (estacion) {
            case 1:
                    System.out.println("Es Primavera");
                break;
            case 2:
                    System.out.println("Es Verano");
                break;
            case 3:
                    System.out.println("Es Otoño");
                break;
            case 4:
                    System.out.println("Es Iniverno");
                break;
            default: System.out.println("Elija una de las cuatro estaciones del 1 al 4");
                break;
        }
    }
}
