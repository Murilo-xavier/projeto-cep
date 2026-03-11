package principal;

import java.util.ArrayList;
import java.util.List;

import modelo.Endereco;
import servicos.GeradorArquivo;
import servicos.InteracaoUsuario;
import servicos.ViaCepService;

public class testes {

    public static void main(String[] args) {
        ViaCepService viaCepService = new ViaCepService();
        InteracaoUsuario.solicitarCep();
        String cepResposta = InteracaoUsuario.getCep();

        Endereco endereco = viaCepService.buscarEndereco(cepResposta);
        List<String> listaEnderecos = new ArrayList<>();
        listaEnderecos.add(endereco.toString());

        System.out.println(endereco);

        GeradorArquivo.gerarArquivo("Arquivo.json", listaEnderecos);
    }
}
