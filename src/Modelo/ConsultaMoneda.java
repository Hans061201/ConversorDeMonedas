package Modelo;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Moneda buscarMoneda(String moneda_base,String moneda_destino ){
        URI adrress = URI.create("https://v6.exchangerate-api.com/v6/efaeefea7d2ef74890fceb6a/pair/"+moneda_base+"/"+moneda_destino);


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(adrress).build();

        try{
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
