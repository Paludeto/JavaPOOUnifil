package br.edu.unifil.lp1.abstrato.modelo;

public class Horista extends Funcionario {

    private double horasTrabalhadas;

    public Horista(String nome, int matricula, double salario, double horasTrabalhadas) {
        super(nome, matricula, salario);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int novasHorasTrabalhadas) {
        this.horasTrabalhadas = novasHorasTrabalhadas;
    }

    @Override
    public double getGanhoMensal() {
        return getSalario() * horasTrabalhadas;
    }

}
