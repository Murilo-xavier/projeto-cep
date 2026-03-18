package servicos;

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

    public Endereco buscarEndereco(String cep) {
        URI url = formatarURL(cep);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(url).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar o endereço: " + e.getMessage());
        }

    }
}
