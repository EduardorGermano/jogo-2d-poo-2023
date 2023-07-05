package br.ifpr.jogo.modelo;
import javax.swing.ImageIcon;

public class TiroEspecial extends ElementoGrafico {
    private static int VELOCIDADE = 2;

    public TiroEspecial(int posicaoPersonagemEmX, int posicaoPersonagemEmY){
        this. carregar();
        this.posicaoEmX = posicaoPersonagemEmX - (this.larguraImagem / 2);
        this.posicaoEmY = posicaoPersonagemEmY;
    }

    public void carregar(){
        ImageIcon carregando = new ImageIcon("recurso\\Especial.png");
        this.imagem = carregando.getImage();
        this.alturaImagem = this.imagem.getHeight(null);
        this.larguraImagem = this.imagem.getWidth(null);
    }

    public void atualizar(){
        this.posicaoEmY = this.posicaoEmY - VELOCIDADE;
    }
}
