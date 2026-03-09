package principal;

import modelo.Endereco;
import servicos.InteracaoUsuario;
import servicos.ViaCepService;

public class testes {

    public static void main(String[] args) {
        ViaCepService viaCepService = new ViaCepService();
        InteracaoUsuario.solicitarCep();
        String cepResposta = InteracaoUsuario.getCep();

        Endereco endereco = viaCepService.buscarEndereco(cepResposta);
        System.out.println(endereco);
    }
}
