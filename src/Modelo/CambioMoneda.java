package Modelo;

import java.util.Scanner;

public class CambioMoneda {
    Scanner entrada = new Scanner(System.in);


    public void cambiar( float tasa, String monedaDestino){
        System.out.println("Cuanto desea cambiar?");
        float cantidad = entrada.nextFloat();
        System.out.println("Su cambio es: " +  cantidad * tasa + " " + monedaDestino);    }
}
