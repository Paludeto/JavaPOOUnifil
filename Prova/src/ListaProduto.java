import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListaProduto {

    ArrayList<Produto> lista;

    public ListaProduto() {
        this.lista = new ArrayList<Produto>();
    }

    public void addProduto(Produto prod) {
        lista.add(prod);
    }

    public ArrayList<String> mostraProdutos() {
        Produto prod;
        ArrayList<String> array = new ArrayList<String>();

        for(int i = 0; i < lista.size(); i ++) {
            prod = lista.get(i);
            array.add(prod.getDescricao());
        }

        return array;
    }


}
