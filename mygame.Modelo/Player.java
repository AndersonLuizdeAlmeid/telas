package mygame.Modelo;

public class Player{

    private int x, y;
    private int dx, dy;
    private Image imagem;
    private int altura, largura;

    public Player(){
        this.x = 100;
        this.y = 100;// Define o local da tela onde o player vai spawnar
    }

    public void load(){
        ImageIcon referencia = new ImageIcon("Imagem player sem parado");
        imagem = referencia.getImage();
        altura = imagem.getHeight(null);// tamanho da imagem
        largura = imagem getWidth(null);// alrgura da imagem
    }

    public void update(){
        x += dx;// vai fazer a imagem da nave se mover no eixo X ou Y.
        y += dy;
    }

    public void keyPressed(KeyEvent tecla){
        int codigo = tecla.getKeyCode();

        if(codigo == KeyEvent.vk_up){
            dy = -3; // se apertar para cima a nave se move para cima
        }
        if(codigo == KeyEvent.vk_down){
            dy = 3; // se apertar para baixo a nave se move para baixo
        }
        if(codigo == KeyEvent.vk_left){
            dx = -3; // se apertar para esquerda a nave se move para esquerda
        }
        if(codigo == KeyEvent.vk_right){
            dx = 3; // se apertar para direita a nave se move para direita
        }
    }

    public void keyRelease(KeyEvent tecla){
        int codigo = tecla.getKeyCode();

        if(codigo == KeyEvent.vk_up){
            dy = 0; 
        }
        if(codigo == KeyEvent.vk_down){
            dy = 0; 
        }
        if(codigo == KeyEvent.vk_left){
            dx = 0; 
        }
        if(codigo == KeyEvent.vk_right){
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

}