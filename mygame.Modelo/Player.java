package mygame.Modelo;

import java.awt.event.KeyEvent;

public class Player{

    private int x, y;
    private int dx, dy;
    private Image imagem;
    private int altura, largura;
    private List <Tiro> tiros;

    public Player(){
        this.x = 100;
        this.y = 100;// Define o local da tela onde o player vai spawnar


        tiros = new ArraList<Tiro>();
    }

    public void load(){
        ImageIcon referencia = new ImageIcon("res\\olha.gif");
        imagem = referencia.getImage();
        altura = imagem.getHeight(null);// tamanho da imagem
        largura = imagem.getWidth(null);// alrgura da imagem
    }

    public void update(){
        x += dx;// vai fazer a imagem da nave se mover no eixo X ou Y.
        y += dy;
    }

    public void tiroSimples(){
        this.tiros.add(new Tiro(x + largura, y + (largura / 2)));//
    }

    public Rectangle getBounds(){
        return new Rectangle(x, y, largura, altura);
    }

    public void keyPressed(KeyEvent tecla){
        int codigo = tecla.getKeyCode();

        if(codigo == KeyEvent.VK_A){
            tiroSimples();
        }
        if(codigo == KeyEvent.VK_UP){
            dy = -3; // se apertar para cima a nave se move para cima
        }
        if(codigo == KeyEvent.VK_DOWN){
            dy = 3; // se apertar para baixo a nave se move para baixo
        }
        if(codigo == KeyEvent.VK_LEFT){
            dx = -3; // se apertar para esquerda a nave se move para esquerda
        }
        if(codigo == KeyEvent.VK_RIGHT){
            dx = 3; // se apertar para direita a nave se move para direita
        }
    }

    public void keyRelease(KeyEvent tecla){
        int codigo = tecla.getKeyCode();

        if(codigo == KeyEvent.VK_UP){
            dy = 0; 
        }
        if(codigo == KeyEvent.VK_DOWN){
            dy = 0; 
        }
        if(codigo == KeyEvent.VK_LEFT){
            dx = 0; 
        }
        if(codigo == KeyEvent.VK_RIGHT){
            dx = 0; 
        }
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Image getImage(){
        return imagem;
    }

    public List<Tiro> getTiros(){
        return tiros;
    }

}