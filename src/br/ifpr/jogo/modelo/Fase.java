package br.ifpr.jogo.modelo;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Fase extends JPanel implements KeyListener,ActionListener{
    private Image imagemFundo;
    private Personagem personagem;
    private Timer timer;

    private static final int DELAY = 5;
    private static final int VELOCIDADE_DE_DESCOLAMENTO = 3;

    public Fase(){
        this.setFocusable(true);
        this.setDoubleBuffered(true);
        ImageIcon carregando = new ImageIcon("recurso\\Fundo.jfif");
        this.imagemFundo = carregando.getImage();

        this.personagem = new Personagem(VELOCIDADE_DE_DESCOLAMENTO);
        this.personagem.carregar();
        this.addKeyListener(this);

        this.timer = new Timer(DELAY, this);
        this.timer.start();
    }

    public void paint(Graphics g){
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(this.imagemFundo, 0, 0, null);
        graficos.drawImage(this.personagem.getImagem(), this.personagem.getPosicaoEmX(), this.personagem.getPosicaoEmY(), null);
        g.dispose();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        this.personagem.mover(e);
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.personagem.parar(e);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.personagem.atualizar();
        repaint();        
    }
}