import java.util.InputMismatchException;
import java.util.Scanner;

public class UsaArray{

    private Scanner teclado;

    public UsaArray(){
        teclado = new Scanner(System.in);
    }

    public void carregaArray(int[] arr) { //1) implemente try..catch
        for(int i=0; i<arr.length; i++){
            System.out.println("Informe Numero: ");
            try {
                arr[i] = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro, teclado só aceita inteiros.");
                teclado.nextLine();
            }
        }
    }

    public String mostraArray(int arr[]) {
        String saida="";
        for(int i=0; i<arr.length; i++){
            saida = saida + arr[i] + '\n';
        }
        return saida;
    }

    public int[] geraArrayDivisao(int arrA[],
                                  int arrB[]) { //2) implemente try..catch
        int aux[] = new int[arrA.length];
        try {
            for (int i = 0; i < arrA.length; i++) {
                aux[i] = arrA[i] / arrB[i];
            }
        } catch (ArithmeticException e) {
            System.out.println("Impossível realizar a divisão por 0.");
            teclado.nextLine();
        }
        return aux;
    }

    public void atualizaArray(int arr[], int posicao, int novoValor) throws ArrayIndexOutOfBoundsException {
        if (posicao > arr.length || posicao < 0) {
            throw new ArrayIndexOutOfBoundsException("Indíce fora de alcance");
        } else {
            arr[posicao] = novoValor;
        }
    }

}
