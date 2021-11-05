import java.util.Scanner;


public class Numeros {

    private int[] numeros;
    private Scanner sc;


    //construtor
    public Numeros(int tamanho) {
        numeros = new int[tamanho];
        sc = new Scanner(System.in);
    }


    public void carregaNumeros() {
        System.out.println("Informe os números:");
        for (int indice = 0; indice < numeros.length; indice++) {
            numeros[indice] = sc.nextInt();
        }
    }


    public String mostraNumeros() {
        String num = "";
        for (int i = 0; i < numeros.length; i++) {
            num += " " + numeros[i];//retorne os números armazenados no array em formato de linha. Os números devem ser separados por vírgula, exemplo: 22, 3, 5, 11, 224.
        }
        return num;
    }


    public int maiorNumero() {
        int maximo = numeros[0];   // start with the first value
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];   // new maximum
            }
        }
        return maximo;//retorne o maior número armazenado no array
    }


    public int[] mostraParImpar(int tipo) throws ParImparException {
        int[] pares = new int[numeros.length];
        int[] impares = new int[numeros.length];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[i] = numeros[i];
            } else if (numeros[i] % 2 == 1) {
                impares[i] = numeros[i];
            }
        }
        switch (tipo) {
            case 1:
                return pares;
            case 2:
                return impares;
            default:
                throw new ParImparException("Informe 1 ou 2.");
        } //retorne um array contendo os números pares ou ímpares de acordo com o atributo tipo. Considere tipo = 1 (par) e tipo = 2 (ímpar).
    }

    public void alteraNumero(int indice, int novoValor) {
        numeros[indice] = novoValor;//método para alterar um valor armazenado no array
    }

}

