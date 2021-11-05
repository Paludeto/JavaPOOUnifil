import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteClasseNumero {

    public static void main(String[] args) throws ParImparException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Defina o número de elementos do array");
            Numeros num = new Numeros(sc.nextInt());
            int opcao = 0;
            do {
                try {
                    System.out.println(("\n" + """
                            Escolha um:                    
                            1. Definir valores.
                            2. Mostrar valores.
                            3. Mostrar maior número.
                            4. Mostrar se é par ou ímpar.
                            5. Sair.
                            """));
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("Defina os valores.");
                            num.carregaNumeros();
                            break;
                        case 2:
                            System.out.println(num.mostraNumeros());
                            break;
                        case 3:
                            System.out.println(num.maiorNumero());
                            break;
                        case 4:
                            System.out.println("Digite 1 para par e 2 para ímpares");
                            System.out.println(num.mostraParImpar(sc.nextInt()));
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Especifique um inteiro válido.");
                    sc.nextLine();
                } catch (ParImparException e) {
                    System.out.println("Utilize 1 ou 2.");
                    sc.nextLine();
                }
            } while (opcao != 5);
        } catch (InputMismatchException e) {
            System.out.println("Especifique apenas inteiros. Execute o programa novamente.");
            sc.nextLine();
        }
    }

}