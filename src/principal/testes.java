package principal;

import java.io.IOException;

import servicos.ViaCepService;

public class testes {

    public static void main(String[] args) {
        ViaCepService viaCepService = new ViaCepService();
        try {
            String endereco = viaCepService.buscarEndereco("01001000");
            System.out.println(endereco);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}   
