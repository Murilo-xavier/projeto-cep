package servicos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import modelo.Endereco;

public class ViaCepService {

    private String URL_BASE = "https://viacep.com.br/ws/";

    private URI formatarURL(String cep) {
        return URI.create(URL_BASE + cep + "/json/");
    }

    private HttpResponse<String> buscarEnderecoAPI(String cep) {
        URI url = formatarURL(cep);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(url).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response;
        } catch (IOException | InterruptedException e) {
            System.out.print(e.getMessage());
        }
        return null;
    }

    public Endereco buscarEndereco(String cep) {
        try {
            HttpResponse<String> response = buscarEnderecoAPI(cep);
            return new Gson().fromJson(response.body(), Endereco.class) ;
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return null;
    }
}
