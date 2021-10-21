package br.edu.unifil.lpoo.equipe.visao;
import br.edu.unifil.lpoo.equipe.modelo.*;

public class TesteEquipe {

    public static void main(String[] args) throws ParametroInvalidoException {

        Jogador j1 = new Jogador("Cleiton Rasta", "Zagueiro");
        j1.setPosicao("Atacante");
        j1.setNome("Cleiton Rasta 2");
        System.out.println(j1.getNome());
        System.out.println(j1.getPosicao());

        Equipe e1 = new Equipe("Paysandu");
        e1.setNomeDaEquipe("Rolandia");
        System.out.println(e1.getNomeDaEquipe());

    }

}
