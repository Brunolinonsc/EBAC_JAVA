import java.util.Scanner;
/**
 * @author Bruno Lino Nascimento
 */
public class App {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Digite um número inteiro: ");                
                int numeroPrimitivo = scanner.nextInt();
                
                Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);
                System.out.println("Número primitivo: " + numeroPrimitivo);
                System.out.println("Número wrapper: " + numeroWrapper);
            }
        };
}
