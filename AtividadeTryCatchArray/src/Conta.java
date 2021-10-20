public class Conta {

    private double saldo;
    private int numero;

    public Conta(int numero, double saldo) {
        numero = this.numero;
        saldo = this.saldo;
    }

    public void setNumero(int novoNumero) throws NumeroInvalidoException {
        if (novoNumero < 0 || novoNumero > 1000) {
            throw new NumeroInvalidoException("O numero deve ser positivo e menor que 1000");
        } else {
            novoNumero = this.numero;
        }
    }

    public void deposito(double valor) throws ValorNegativoException {
        if (valor < 0) {
            throw new ValorNegativoException("O valor nao pode ser negativo");
        } else {
            this.saldo += valor;
        }
    }

    public void saca(double valor) throws SaldoInsuficienteException {
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        } else {
            this.saldo -= valor;
        }
    }

}
