import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Abaixo voce professor irá inserir as quatro notas do aluno e ao termino do programa ira aparecer a média do aluno e se o mesmo esta aprovado.");
        System.out.println("===========================================================");

        Scanner n1 = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno: ");
        float num1 = n1.nextFloat();

        Scanner n2 = new Scanner(System.in);
        System.out.println("Digite a segunda nota do aluno: ");
        float num2 = n2.nextFloat();

        Scanner n3 = new Scanner(System.in);
        System.out.println("Digite a terceira nota do aluno: ");
        float num3 = n3.nextFloat();
        
        Scanner n4 = new Scanner(System.in);
        System.out.println("Digite a quarta nota do aluno: ");
        float num4 = n4.nextFloat();

        float media = (num1 + num2 + num3 + num4) / 4;
        System.out.println("===========================================================");
        System.out.println("A média do aluno é " + media + ".");
        System.out.println("===========================================================");
        
        if (media >= 7 ){
            System.out.println("Aluno aprovado.");
            System.out.println("===========================================================");
        }else if (media < 7 && media >=5) {
            System.out.println("Aluno em recuperação.");
            System.out.println("===========================================================");
        } else {
            System.out.println("Aluno reprovado.");
            System.out.println("===========================================================");
        }
    }
}
