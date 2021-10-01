import java.util.Scanner;

public class TrocaVariavel {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Determine o valor de a:");
        int a = sc.nextInt();

        System.out.println("Determine o valor de b:");
        int b = sc.nextInt();

        int aux = a;
        a = b;
        b = aux;

        System.out.println("Troca de a por " + a);
        System.out.println("Troca de b por " + b);
    }
}
