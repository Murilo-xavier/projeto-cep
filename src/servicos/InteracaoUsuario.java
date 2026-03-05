package servicos;

import java.util.Scanner;

public class InteracaoUsuario {
    private static Scanner scanner = new Scanner(System.in);
    private static String cep;

    private static boolean validarCep(String cep) {
        return cep.matches("\\d{8}");
    }

    public static void solicitarCep() {
        String resposta;
        System.out.println("Digite o CEP que deseja consultar:");
        resposta = scanner.nextLine();
        if (validarCep(resposta)) {
            cep = resposta;
        } else {
            System.out.println("CEP inválido!");
        }
    }

    public static String getCep() {
        return cep;
    }
}
