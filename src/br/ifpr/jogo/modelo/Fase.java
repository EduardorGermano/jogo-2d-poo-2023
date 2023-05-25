package br.ifpr.jogo.modelo;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Fase extends JPanel{
    private Image imagemFundo;
    private Personagem personagem;

    public Fase(){
        ImageIcon carregando = new ImageIcon("recurso\\Fundo.jfif");
        this.imagemFundo = carregando.getImage();

        this.personagem = new Personagem();
        this.personagem.carregar();
    }

    public void paint(Graphics g){
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(this.imagemFundo, 0, 0, null);
        graficos.drawImage(this.personagem.getImagem(), this.personagem.getPosicaoEmX(), this.personagem.getPosicaoEmY(), null);
        g.dispose();
    }
}