package br.edu.unifil.lp1.abstrato.modelo;

public class Produção extends Funcionario {

    private double quantidadeProduzida;

    public Produção(String nome, int matricula, double salario, double quantidadeProduzida) {
        super(nome, matricula, salario);
        this.quantidadeProduzida = quantidadeProduzida;
    }


    public double getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(double quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }

    @Override
    public double getGanhoMensal() {
        return getSalario() * quantidadeProduzida;
    }

}
