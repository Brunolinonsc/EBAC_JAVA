import java.util.ArrayList;
import java.util.Scanner;

public class GrupoPorSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome (ou 'sair' para finalizar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                masculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido! Use 'M' para masculino ou 'F' para feminino.");
            }
        }

        scanner.close();

        System.out.println("\nGrupo Masculino:");
        for (String nome : masculino) {
            System.out.println("- " + nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : feminino) {
            System.out.println("- " + nome);
        }
    }
}
