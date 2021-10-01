package br.edu.unifil.lpoo.universidade.controle;
import br.edu.unifil.lpoo.universidade.modelo.*;
import java.util.ArrayList;

public class Controle {

    ArrayList<Professor> listProf;

    public Controle() {
        listProf = new ArrayList<>();
    }

    public void incluiProfessor(Professor prof) {
        listProf.add(prof);
    }

    public String listaProfessores() {
        Professor professor;
        String saida = "";
        for (Professor value : listProf) {
            professor = value;
            saida += '\n' + "Nome: " + professor.getNome() + '\n' +
                    "Salario: " + professor.getSalario();
        }
        return saida;
    }

    public ArrayList<Professor> getListaProf() {
        return listProf;
    }

    public String mostrarDados() {
        Professor professor;
        String saida = "";
        for (int i = 0; i < listProf.size(); i++) {
            professor = listProf.get(i);
            saida += '\n' + professor.getDados();
        }
        return saida;
    }
}
