package br.edu.unifil.lp1.abstrato.modelo;

public class Mensalista extends Funcionario {

    public Mensalista(String nome, int matricula, double salario) {
        super(nome, matricula, salario);
    }

    @Override
    public double getGanhoMensal() {
        return getSalario();
    }

}
