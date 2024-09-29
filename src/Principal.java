import Modelo.CambioMoneda;
import Modelo.ConsultaMoneda;
import Modelo.Moneda;
import Modelo.MonedaEntrada;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        CambioMoneda cambioMoneda = new CambioMoneda();
        MonedaEntrada monedaEntrada = new MonedaEntrada();
        String monedaBase=monedaEntrada.seleccionarMonedaBase();
        String monedaDestino = monedaEntrada.seleccionarMonedaCambio(monedaBase);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();


        try{
            Moneda moneda = consultaMoneda.buscarMoneda(monedaBase, monedaDestino);
            cambioMoneda.cambiar(moneda.conversion_rate(), monedaDestino);
        }catch (NumberFormatException e){
            System.out.println("La moneda no existe");
        }
    }
}
