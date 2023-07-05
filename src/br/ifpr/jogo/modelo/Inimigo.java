package br.ifpr.jogo.modelo;
import javax.swing.ImageIcon;

public class Inimigo extends ElementoGrafico{
    private static final int VELOCIDADE = 2;

    public Inimigo(int xAleatorio, int yAleatorio){
        this.posicaoEmX = xAleatorio;
        this.posicaoEmY = yAleatorio;
    }

    public void carregar(){
        ImageIcon carregando = new ImageIcon("recurso\\Inimigo.png");
        this.imagem = carregando.getImage();
        this.alturaImagem = this.imagem.getHeight(null);
        this.larguraImagem = this.imagem.getWidth(null);
    }

    public void atualizar(){
        this.posicaoEmY = this.posicaoEmY + VELOCIDADE;
    }

}
