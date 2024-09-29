package Modelo;

import java.util.Scanner;

public class MonedaEntrada {
    Scanner entrada = new Scanner(System.in);
    CambioMoneda cambioMoneda = new CambioMoneda();

    public String seleccionarMonedaBase(){
        System.out.println("===================Cambiador de Monedas===================");
        System.out.println("Selecciones su moneda a cambiar: ");
        System.out.println("1. Peso Argentino");
        System.out.println("2. Boliviano Boliviano  ");
        System.out.println("3. Real Brasileño ");
        System.out.println("4. Peso Chileno ");
        System.out.println("5. Peso Colombiano ");
        System.out.println("6. Dolar Estadounidendse ");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        String monedaBase = seleccionarMoneda(opcion);
        return monedaBase;
    }

    public String seleccionarMonedaCambio(String monedaBase){
        String monedaCambio;
        System.out.println("Selecciones su moneda de destino: ");
        System.out.println("1. Peso Argentino ");
        System.out.println("2. Boliviano Boliviano  ");
        System.out.println("3. Real Brasileño ");
        System.out.println("4. Peso Chileno ");
        System.out.println("5. Peso Colombiano ");
        System.out.println("6. Dolar Estadounidendse ");
        do {
        int opcion = entrada.nextInt();
        entrada.nextLine();
        monedaCambio = seleccionarMoneda(opcion);
        if(monedaCambio.equals(monedaBase)){
            System.out.println("Seleccione una moneda de destino diferente a su monda base.");
        }
        }while(monedaCambio.equals(monedaBase));

        return monedaCambio;
    }


    public String seleccionarMoneda(int opcion){

        switch (opcion){
            case 1: return "ARS";
            case 2: return "BOB";
            case 3: return "BRL";
            case 4: return "CLP";
            case 5: return "COP";
            case 6: return "USD";
            default:
                return "-1";
        }
    }

}
