package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaFamilia extends Consulta {
    private double descontoFamilia = 0.50;

    public double getValorConsulta() {
        if (super.getNumDep() > 2) {
            return super.getValorConsulta()  * descontoFamilia;
        } else {
            return super.getValorConsulta();
        }
    }
    public ConsultaFamilia(){
        super();
    }
    public ConsultaFamilia(Consulta consulta){
        super(consulta);
    }
}