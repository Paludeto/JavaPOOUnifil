import java.util.ArrayList;

public class TesteProduto {

    public static void main(String[] args) throws DescricaoNulaException, SaldoInsuficienteException {
        ListaProduto lp = new ListaProduto();
        Produto prod1 = new Produto("Playstation");
        Produto prod2 = new Produto("Playstation");
        Produto prod3 = new Produto("Mouse");
        Produto prod4 = new Produto("Teclado");
        Produto prod5 = new Produto("Mouse");
        Produto prod6 = new Produto("Outra Coisa");

        lp.addProduto(prod1);
        lp.addProduto(prod2);
        lp.addProduto(prod3);
        lp.addProduto(prod4);
        lp.addProduto(prod5);

        ArrayList<Produto> novoArray = new ArrayList<>();
        novoArray.add(prod1);
        novoArray.add(prod2);
        novoArray.add(prod3);
        novoArray.add(prod6);


        System.out.println(lp.getProdutoDuplicada(lp.lista));
        System.out.println(lp.retornaDescricoesEmComum(novoArray));
        System.out.println(lp.retornaDescricoesDiferentes(novoArray));

    }

}
