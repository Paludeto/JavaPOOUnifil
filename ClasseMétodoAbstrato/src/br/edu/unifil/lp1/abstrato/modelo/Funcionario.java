package br.edu.unifil.lp1.abstrato.modelo;

public abstract class Funcionario extends Pessoa {

    private int matricula;
    private double salario;

    public Funcionario(String nome, int matricula, double salario) {
        super(nome);
        this.matricula = matricula;
        this.salario = salario;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) throws SalarioInvalidoException {
        if (salario < 0) {
            throw new SalarioInvalidoException("Coloque um número maior que 0");
        } else {
            this.salario = salario;
        }
    }

    public abstract double getGanhoMensal();

}
