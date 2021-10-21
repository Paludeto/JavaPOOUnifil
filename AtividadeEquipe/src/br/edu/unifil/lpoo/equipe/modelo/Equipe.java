package br.edu.unifil.lpoo.equipe.modelo;
import java.util.ArrayList;

public class Equipe {

    private ArrayList<Jogador> listaJogadores;
    private String nomeDaEquipe;

    public Equipe(String nomeDaEquipe) {
        this.nomeDaEquipe = nomeDaEquipe;
        this.listaJogadores = new ArrayList<>();
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
            concatena = "Nome: " + jog.getNome() + '\n' + "Posição: " + jog.getPosicao();
        }
        return concatena;
    }

    public Jogador getJogador(String nome) throws ParametroInvalidoException {
        Jogador jog = new Jogador();
        for (int i = 0; i < listaJogadores.size(); i++) {
            if (nome.equals(listaJogadores.get(i).getNome())) {
                jog = listaJogadores.get(i);
            } else {
                throw new ParametroInvalidoException("Deu ruim");
            }
        }
        return jog;
    }

}
