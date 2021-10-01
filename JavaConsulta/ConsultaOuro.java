package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaOuro extends Consulta {
    private double descontoOuro = 0.7;

    public double getValorConsulta() {
        if (getAno() <= 2000) {
            setValorConsulta(0);
            return super.getValorConsulta();
        } else {
            return super.getValorConsulta() * descontoOuro ;
        }
    }
    public ConsultaOuro(){
        super();
    }
    public ConsultaOuro(Consulta consulta){
        super(consulta);
    }
}
