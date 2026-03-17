package servicos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeradorArquivo {

    public static void gerarArquivo(String nomeArquivo, List<String> conteudo) {
        
        try {
            FileWriter file = new FileWriter(nomeArquivo);
            String json = Conversor.converterObjetoParaJson(conteudo);
            file.write(json);
            file.close();
        } catch (IOException e) {
            System.out.println("--Algum erro ocorreu ao gerar o arquivo: " + e.getMessage());
        }
    }
}
