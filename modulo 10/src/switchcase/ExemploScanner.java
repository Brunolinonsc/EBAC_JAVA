package switchcase;

import java.util.Scanner;

public class ExemploScanner {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        System.out.println("Voce tem " + idade + " anos.");
    }
}
