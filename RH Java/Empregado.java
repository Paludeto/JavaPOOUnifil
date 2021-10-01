public class Empregado extends Pessoa {
    private double salario;

    public Empregado(String nome, double salario){
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}


