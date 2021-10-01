import java.util.ArrayList;

public class Controle {
    private ArrayList<Empregado> listaEmp;
    private ArrayList<Departamento> listaDep;

    public Controle(){
        listaEmp = new ArrayList<>();
        listaDep = new ArrayList<>();
    }

    public void cadastraEmpregado(String nome, double salario){
        //adiciona o empregado na lista geral de empregados
        listaEmp.add(new Empregado(nome, salario));
    }

    public void cadastraDepartamento(String nome){
        //adiciona o depto na lista
        listaDep.add(new Departamento(nome));
    }

    public void adicionaEmpDep(String departamento, String nome){
        Departamento auxDep;
        Empregado auxEmp;
        for(int i=0; i<listaDep.size();i++){
            auxDep = listaDep.get(i);
            if (departamento.equals(auxDep.getNome())){
                for(int j=0; j<listaEmp.size();j++) {
                    auxEmp = listaEmp.get(j);
                    if (nome.equals(auxEmp.getNome())) {
                        auxDep.addEmpregado(auxEmp);
                        break;
                    }
                }
                break;
            }
        }
    }

    public String listarEmpregados(){
        String saida="";
        Empregado auxEmp;
        for(int i=0; i<listaEmp.size(); i++){
            auxEmp = listaEmp.get(i);
            saida = saida + auxEmp.getNome() + " " + auxEmp.getSalario() + '\n';
        }
        return saida;
    }

    public void removeEmpDep(String departamento, String nome){
        //localizar departamento e funcionario
        //se achou remove empregado do departamento,
        //chamar metodo removeEmpregado() da classe Departamento
        Departamento auxDep;
        Empregado auxEmp;
        for(int i=0; i<listaDep.size();i++){
            auxDep = listaDep.get(i);
            if (departamento.equals(auxDep.getNome())){
                for(int j=0; j<listaEmp.size();j++) {
                    auxEmp = listaEmp.get(j);
                    if (nome.equals(auxEmp.getNome())) {
                        auxDep.removeEmpregado(auxEmp);
                        break;
                    }
                }
                break;
            }
        }
    }

    public String listarDepartamento(){
        //retorne o nome dos departamentos cadastrados no ArrayList listDep
        //RETORNE TAMBÉM O NOME DOS FUNCIONARIOS DO DEPARTAMENTO
        String saida="";
        Departamento auxDep;
        for(int i=0; i<listaDep.size(); i++){
            auxDep = listaDep.get(i);
            saida = saida + auxDep.getNome() + '\n' + auxDep.listarEmpregado();
        }
        return saida;
    }

    public String listarDepartamento(String departamento){
        //retorne os empregados do departamento informado como parÃ¢metro
        String saida = "";
        Departamento auxDep;
        for(int i=0; i<listaDep.size(); i++){
            auxDep = listaDep.get(i);
            if (departamento.equals(auxDep.getNome())){
                saida = auxDep.listarEmpregado();
            }
        }
        return saida;
    }

}
