package br.edu.unifil.lpoo.universidade.modelo;

public class Professor {

    protected String nome;
    protected String matricula;
    protected double salario;

    public Professor() {

    }

    public Professor(String nome, String matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDados() {
        return  "Nome: " + this.nome + '\n' +
                "Salario: " + getSalario() + '\n' +
                "Matricula: " + getMatricula();

    }

}
