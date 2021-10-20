public class TestaConta {
    public static void main(String[] args) throws NumeroInvalidoException {

        Conta c = new Conta(100, 0);
        try {
            c.saca(1);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }

        Conta c2 = new Conta(150, 50);
        try {
            c.setNumero(11000);
        } catch (NumeroInvalidoException e) {
            e.printStackTrace();
        }

        Conta c3 = new Conta(200, 100);
        try {
            c3.deposito(-20);
        } catch (ValorNegativoException e) {
            e.printStackTrace();
        }
    }



}
