package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaDiamante extends Consulta {
    private double descontoDia = 0.6;

    public double getValorConsulta() {
        return super.getValorConsulta()  * descontoDia;
    }
    public ConsultaDiamante(){
        super();
    }
    public ConsultaDiamante(Consulta consulta){
        super(consulta);
    }

}