package servicos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepService {

    private String URL_BASE = "https://viacep.com.br/ws/";

    private String formatarURL(String cep){
        return URL_BASE + cep + "/json/";
    }

    private HttpResponse<String> buscarEnderecoAPI(String cep) throws IOException, InterruptedException{
        String url = formatarURL(cep);
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response;
    }

    public String buscarEndereco(String cep) throws IOException, InterruptedException{
        HttpResponse<String> response = buscarEnderecoAPI(cep);
        return response.body();
    }
}
