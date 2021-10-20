import java.util.InputMismatchException;
import java.util.Scanner;
public class TestaUsaArray{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];
        int opcao = 0;
        UsaArray usa = new UsaArray();
        while (opcao != 9){
            System.out.println("1-atualiza array A");
            System.out.println("2-atualiza array B");
            System.out.println("3-mostra array A");
            System.out.println("4-mostra array B");
            System.out.println("5-mostra array C");
            System.out.println("6-gerar array C divisão");
            System.out.println("9-fim");
//3)implemente try..catch
            try {
                opcao = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro, escolha uma opção válida.");
                teclado.nextLine();
            }

            switch(opcao){
                case 1 : //4) invocar o método carregaArray()
                    usa.carregaArray(a);
                    break;
                case 2 : //5) invocar o método carregaArray()
                    usa.carregaArray(b);
                    break;
                case 3 : //6) invocar o método mostraArray() e mostrar os números do array A
                    usa.mostraArray(a);
                    break;
                case 4 : //7) invocar o método mostraArray() e mostrar os números do array B
                    usa.mostraArray(b);
                    break;
                case 5 : //8) invocar o método mostraArray() e mostrar os números do array C
                    usa.mostraArray(c);
                    break;
                case 6 : //9) invocar o método geraArrayDivisao() para carregar o array C
                    c = usa.geraArrayDivisao(a, b);
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        }
    }
}