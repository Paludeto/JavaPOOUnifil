package br.edu.unifil.lp1.abstrato.modelo;

public class Comissionado extends Funcionario {

    private double comissao;
    private double quantidadeVendida;

    public Comissionado(String nome, int matricula, double salario, double commisao, double quantidadeVendida) {
        super(nome, matricula, salario);
        this.comissao = commisao;
        this.quantidadeVendida = quantidadeVendida;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double novaComissao) {
        this.comissao = novaComissao;
    }

    public double getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int novaQuantidadeVendida) {
        this.quantidadeVendida = novaQuantidadeVendida;
    }

    @Override
    public double getGanhoMensal() {
        return getSalario() + comissao * quantidadeVendida;
    }

}
