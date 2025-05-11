import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SepararPorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        System.out.println("Digite os nomes e sexos (Nome-Sexo), separados por vírgula. Ex: Ana-F,Carlos-M");
        String entrada = scanner.nextLine();
        String[] pessoas = entrada.split(",");

        for (String pessoaInfo : pessoas) {
            String[] dados = pessoaInfo.trim().split("-");
            if (dados.length == 2) {
                String nome = dados[0].trim();
                String sexo = dados[1].trim().toUpperCase(); // Converte para maiúsculo para facilitar a comparação

                if (sexo.equals("M")) {
                    masculino.add(nome);
                } else if (sexo.equals("F")) {
                    feminino.add(nome);
                } else {
                    System.out.println("Sexo inválido para: " + nome);
                }
            } else {
                System.out.println("Formato inválido para: " + pessoaInfo);
            }
        }

        System.out.println("\nGrupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }

        scanner.close();
    }
}