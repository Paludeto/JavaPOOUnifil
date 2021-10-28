package br.edu.unifil.lp1.abstrato.controle;
import br.edu.unifil.lp1.abstrato.modelo.*;
import java.util.ArrayList;

public class Controle {

    private ArrayList<Funcionario> listaEmp;

    public Controle() {
        listaEmp = new ArrayList<Funcionario>();
    }

    public void cadastraFuncionario(Funcionario funcionario) {
        listaEmp.add(funcionario);
    }

    public String listaFuncionario() {
        Funcionario func;
        String concatena = "";
        for (int i = 0; i < listaEmp.size(); i++) {
            func = listaEmp.get(i);
            concatena = "Matrícula: " + func.getMatricula() + '\n' + "Nome: " + func.getNome() + '\n' + "Ganho Mensal: " + func.getGanhoMensal();
        }
        return concatena;
    }

    public Funcionario getFuncionario(String matricula) {
        Funcionario func = null;
        for (int i = 0; i < listaEmp.size(); i++) {
            if (matricula.equals(listaEmp.get(i).getMatricula())) {
                func = listaEmp.get(i);
            } else {
                return null;
            }
        }
        return func;
    }

    public void removeFuncionario(Funcionario funcionario) {
        listaEmp.remove(funcionario);
    }


}
