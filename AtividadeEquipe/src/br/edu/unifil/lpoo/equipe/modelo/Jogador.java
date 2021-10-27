package br.edu.unifil.lpoo.equipe.modelo;

public class Jogador {

    private String nome;
    private String posicao;

    public Jogador(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    public Jogador() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws ParametroInvalidoException {
        if (nome == null) {
            throw new ParametroInvalidoException("Parametro invalido.");
        } else {
            this.nome = nome;
        }
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) throws ParametroInvalidoException {
        if (posicao == null) {
            throw new ParametroInvalidoException("Parametro invalido.");
        } else {
            this.posicao = posicao;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + '\n' + "Posição: " + getPosicao();
    }

}
