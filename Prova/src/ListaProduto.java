import java.lang.reflect.Array;
import java.util.*;

public class ListaProduto {
    ArrayList<Produto> lista;

    public ListaProduto() {
        lista = new ArrayList<Produto>();
    }

    public void addProduto(Produto prod) {
        lista.add(prod);
    }

    //1) altere o metodo para não retornar no ArrayList<String> descrições duplicadas
//lista = notebook, notebook, teclado, .... , notebook
//listaInput = mesa, cadeira, notebook, teclado
//saida = notebook, notebook, teclado ... , notebook <-- errado
//saida = notebook, teclado <-- certo
    public ArrayList<String> getProdutoDuplicada(ArrayList<Produto> listaInput) {

        ArrayList<String> saida = new ArrayList<>();

        for (Produto prod : listaInput) {
            if (!saida.contains(prod.getDescricao())) {
                saida.add(prod.getDescricao());
            }
        }

        return saida;

    }

    //2) crie um método que retorne a descrição de todos os produtos que estão nas duas listas
//atributo e parâmetro
//porém não deve retornar no ArrayList<String> as descrições duplicadas
    public ArrayList<String> retornaDescricoesEmComum(ArrayList<Produto> listaProduto) {

        ArrayList<String> saida = new ArrayList<>();

        for (Produto prod : lista) {
            int i = 0;
            while (i < listaProduto.size()) {
                if (Objects.equals(prod.getDescricao(), listaProduto.get(i).getDescricao())) {
                    saida.add(prod.getDescricao());
                }
                i++;
            }
        }

        for (int i = 0; i < saida.size(); i++) {
            for (int j = 0; j < saida.size(); j++) {
                if (Objects.equals(saida.get(i), saida.get(j))) {
                    saida.remove(i);
                }
            }
        }

        return saida;

    }

//3) crie um método que retorne a descrição de todos os produtos que estão no atributo lista ArrayList<Produto>
//e que não estão na lista do parâmetro listaInput. Não armazenar descrições duplicadas no ArrayList<String>
//lista = notebook, notebook, teclado, notebook, teclado
//listaInput = mesa, cadeira, notebook
//saida = teclado <-- certo
    public ArrayList<String> retornaDescricoesDiferentes(ArrayList<Produto> listaInput) {

        ArrayList<String> saida = new ArrayList<>();

        for (int i = 0; i < listaInput.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (!Objects.equals(lista.get(i).getDescricao(), listaInput.get(i).getDescricao())) {
                    saida.add(lista.get(i).getDescricao());
                }
            }
        }

        for (int i = 0; i < saida.size(); i++) {
            for (int j = 0; j < saida.size(); j++) {
                if (Objects.equals(saida.get(i), saida.get(j))) {
                    saida.remove(i);
                }
            }
        }

        return saida;

    }

}
