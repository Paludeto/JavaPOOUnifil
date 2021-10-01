package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaPrata extends Consulta {
    private double descontoPrata = 0.8;

    public double getValorConsulta() {
        return super.getValorConsulta() *descontoPrata;
    }
    public ConsultaPrata(){
        super();
    }
    public ConsultaPrata(Consulta consulta){
        super(consulta);
    }
}