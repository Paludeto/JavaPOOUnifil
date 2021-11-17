public class Produto {

    private String descricao;
    private double saldo;

    public Produto(String descricao) throws DescricaoNulaException {
        setDescricao(descricao);
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) throws DescricaoNulaException {
        if (descricao != null) {
            this.descricao = descricao;
        } else {
            throw new DescricaoNulaException("Descricao nao pode ser nula.");
        }
    }

    public void saidaProduto(double quantidade) throws SaldoInsuficienteException {
        if (quantidade <= saldo) {
            this.saldo -= quantidade;
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }
    }



}


