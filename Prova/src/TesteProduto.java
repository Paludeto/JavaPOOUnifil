import java.util.ArrayList;

public class TesteProduto {

    public static void main(String[] args) throws DescricaoNulaException, SaldoInsuficienteException {
        ListaProduto lp = new ListaProduto();
        Produto prod1 = new Produto("Playstation");
        Produto prod2 = new Produto("Máquina de lavar");
        Produto prod3 = new Produto("Mouse");
        Produto prod4 = new Produto("Teclado");
        lp.addProduto(prod1);
        lp.addProduto(prod2);
        lp.addProduto(prod3);
        lp.addProduto(prod4);

        try {
            prod1.setDescricao(null);
        } catch(DescricaoNulaException e) {
            e.printStackTrace();
        }

        try {
            prod1.saidaProduto(2500);
        } catch(SaldoInsuficienteException e) {
            e.printStackTrace();
        }

        System.out.println(lp.mostraProdutos());

        prod1.setDescricao("Geladeira");
        prod1.saidaProduto(0);

        System.out.println(lp.mostraProdutos());
    }


}
