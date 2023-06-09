package br.ifpr.jogo.modelo;
import javax.swing.ImageIcon;

public class Tiro extends ElementoGrafico {
    private static int VELOCIDADE = 2;

    public Tiro(int posicaoPersonagemEmX, int posicaoPersonagemEmY) {
        this.carregar();
        this.posicaoEmX = posicaoPersonagemEmX - (this.larguraImagem / 2);
        this.posicaoEmY = posicaoPersonagemEmY;
    }

    public void carregar() {
        ImageIcon carregando = new ImageIcon("recurso\\Tiro.png");
        this.imagem = carregando.getImage();
        this.alturaImagem = this.imagem.getHeight(null);
        this.larguraImagem = this.imagem.getWidth(null);
    }

    public void atualizar() {
        this.posicaoEmY = this.posicaoEmY - VELOCIDADE;
    }

}
