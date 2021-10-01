import java.util.Scanner;

public class SomaDois {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois números para somá-los.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma é de " + soma);
    }
}
