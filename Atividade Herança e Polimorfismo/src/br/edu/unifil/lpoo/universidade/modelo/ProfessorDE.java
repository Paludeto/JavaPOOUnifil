package br.edu.unifil.lpoo.universidade.modelo;

public class ProfessorDE extends Professor {

    private double licencaPremio;

    public ProfessorDE() {

    }

    public ProfessorDE(String nome, String matricula, double salario, double licencaPremium) {
        super(nome, matricula, salario);
        this.licencaPremio = licencaPremium;
    }

    public double getLicencaPremio() {
        return licencaPremio;
    }

    public void setLicencaPremio(double licencaPremium) {
        this.licencaPremio = licencaPremium;
    }

    public String getDados() {
        return super.getDados() + '\n' +
                "Quantidade de licença prêmio: " + licencaPremio;
    }
}
