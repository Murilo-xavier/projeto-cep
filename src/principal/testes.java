package principal;

import servicos.ViaCepService;

public class testes {

    public static void main(String[] args){
       ViaCepService viaCepService = new ViaCepService();
       String resposta = viaCepService.buscarEndereco("99999999");
         System.out.println(resposta);
    }
}   
