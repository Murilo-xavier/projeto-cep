package servicos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepService {

    private String URL_BASE = "https://viacep.com.br/ws/";

    private String formatarURL(String cep) {
        return URL_BASE + cep + "/json/";
    }

    private HttpResponse<String> buscarEnderecoAPI(String cep) {
        String url = formatarURL(cep);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response;
        } catch (IOException | InterruptedException e) {
            System.out.print(e.getMessage());
        }
        return null;
    }

    public String buscarEndereco(String cep){
        try{
            HttpResponse<String> response = buscarEnderecoAPI(cep);
            return response.body();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return null;
    }
}
