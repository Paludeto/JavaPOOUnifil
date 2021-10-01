package br.edu.unifil.lpoo.universidade.modelo;

public class ProfessorHorista extends Professor {

    private int horasTrabalhadas;

    public ProfessorHorista() {

    }

    public ProfessorHorista(String nome, String matricula, double salario, int horasTrabalhadas) {
        super(nome, matricula, salario);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalario() {
        return salario * horasTrabalhadas;
    }

    public String getDados() {
        return  super.getDados() + '\n' +
                "Horas trabalhadas: " + getHorasTrabalhadas();
    }
}
