import java.util.Arrays;
import java.util.Scanner;

public class OrdenadorNomes {
    public static void main(String[] args) {
        // Criar um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pedir ao usuário para inserir os nomes
        System.out.println("Digite os nomes separados por vírgula:");
        String entrada = scanner.nextLine();
        
        // Usar o split para separar os nomes
        String[] nomes = entrada.split(",");
        
        // Remover espaços em branco no início e fim de cada nome
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }
        
        // Ordenar os nomes em ordem alfabética
        Arrays.sort(nomes);
        
        // Imprimir os nomes ordenados
        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        // Fechar o scanner
        scanner.close();
    }
}