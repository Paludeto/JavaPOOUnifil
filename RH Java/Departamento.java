import java.util.ArrayList;

public class Departamento {
    private String nome;
    private ArrayList<Empregado> listaEmp;

    public Departamento(String nome){
        this.nome = nome;
        listaEmp = new ArrayList<>();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void addEmpregado(Empregado emp){
        //inclui um empregado no ArrayList listaEmp
        listaEmp.add(emp);
    }

    public void removeEmpregado(Empregado emp){
        //remove o empregado do ArrayList
        listaEmp.remove(emp);
    }

    public String listarEmpregado(){
        String saida = "";
        Empregado auxEmp;
        for(int i = 0; i<listaEmp.size(); i++){
            auxEmp = listaEmp.get(i);  //captura objeto do ArrayList
            saida = saida + auxEmp.getNome() + '\n';   //quebra linha
            //para chamar o método, é necessário indicar o objeto

            //saida = saida + listaEmp.get(i).getNome() + '\n';
        }
        return saida;
        //Nathan
        //Ana
        //listaEmp.size() = 2
        //i = 0 --> 1 --> 2 --> 3

    }

    public int getQtdEmpregado(){
        return listaEmp.size();
    }
}
