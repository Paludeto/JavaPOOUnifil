package br.edu.unifil.lpoo.equipe.modelo;
import java.util.ArrayList;
import java.util.Objects;

public class Equipe {

    private ArrayList<Jogador> listaJogadores;
    private String nomeDaEquipe;

    public Equipe(String nomeDaEquipe) {
        this.nomeDaEquipe = nomeDaEquipe;
        ArrayList<Jogador> listaJogadores = new ArrayList<>();
    }

    public String getNomeDaEquipe() {
        return nomeDaEquipe;
    }

    public void setNomeDaEquipe(String nomeDaEquipe) throws ParametroInvalidoException {
        if (nomeDaEquipe == null) {
            throw new ParametroInvalidoException("Parametro invalido.");
        } else {
            this.nomeDaEquipe = nomeDaEquipe;
        }
    }

    public void addJogador(Jogador jogador) {
        listaJogadores.add(jogador);
    }

    public void removeJogador(Jogador jogador) {
        listaJogadores.remove(jogador);
    }

    public String listarJogadores() {
        Jogador jog;
        String concatena = "";
        for (int i = 0; i < listaJogadores.size(); i++) {
            jog = listaJogadores.get(i);
            concatena = "Nome: " + jog.getNome() + "Posição: " + jog.getPosicao();
        }
        return concatena;
    }

//    public Jogador getJogador(String nome) throws ParametroInvalidoException {
//        String compara;
//        for (int i = 0; i < listaJogadores.size(); i++) {
//            compara = listaJogadores.get(i).getNome();
//        }
//    }

}
