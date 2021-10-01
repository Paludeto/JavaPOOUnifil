package br.edu.unifil.lpoo.consulta.modelo;

public class Consulta {
    private String nome;
    private String matricula;
    protected int numDep;
    protected int ano;
    protected double valorConsulta;

    public Consulta() {

    }

    public Consulta(Consulta consulta) {
        this.nome = consulta.getNome();
        this.matricula = consulta.getMatricula();
        this.numDep = consulta.getNumDep();
        this.ano = consulta.getAno();
        this.valorConsulta =consulta.getValorConsulta();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String novaMatricula) {
        if(novaMatricula.length()>4){
            this.matricula = novaMatricula.substring(0, 4); //limita a string matricula a 5 caracteres.
        }else{
            this.matricula = novaMatricula;
        }
    }

    public int getNumDep() {
        return this.numDep;
    }

    public void setNumDep(int novoNumDep) {
        this.numDep = novoNumDep;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int novoAno) {
        this.ano = novoAno;
    }

    public double getValorConsulta() {
        return this.valorConsulta;
    }

    public void setValorConsulta(double novoValor) {
        this.valorConsulta = novoValor;
    }
}
