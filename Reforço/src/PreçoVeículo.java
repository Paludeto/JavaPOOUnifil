import java.util.Scanner;

public class PreçoVeículo {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de custo do carro:");
        double valorCusto = sc.nextDouble();
        sc.nextLine();

        System.out.println("Insira a marca do carro:");
        String marca = sc.nextLine();

        System.out.println("Insira o modelo do carro:");
        String modelo = sc.nextLine();
        sc.close();

        double impostos = valorCusto * 0.45;
        double comissao = valorCusto * 0.28;
        double valorFinal = valorCusto + impostos + comissao;

        System.out.println("A marca é " + marca + ", o modelo é " + modelo);
        System.out.println("O valor de custo é de " + valorCusto);
        System.out.println("O valor dos impostos é de " + impostos);
        System.out.println("O valor da comissão é de " + comissao);
        System.out.println("Então, o valor final é de " + valorFinal);
    }
}
