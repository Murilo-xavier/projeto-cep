package principal;

import servicos.InteracaoUsuario;
import servicos.ViaCepService;

public class testes {

    public static void main(String[] args){
       ViaCepService viaCepService = new ViaCepService();
       InteracaoUsuario.solicitarCep();
       
       String resposta = viaCepService.buscarEndereco(InteracaoUsuario.getCep());
         System.out.println(resposta);
    }
}   
