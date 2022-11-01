package meujogo.Modelo;

public class Tiro{

    private Image imagem;
    private int x, y; // posição do tiro
    private int largura, altura;//largura e altura do tiro
    private boolean isVisivel;
    
    private static final int LARGURA = 938;
    private static int VELOCIDADE = 2;
    
    public Tiro(int x, int y){
        this.x = x;
        this.y = y;
        isVisivel = true;
    }
    
    public void load (){
        ImageIcon referencia = new ImageIcon("res\\ tiro");
        imagem = referencia.getImage();

        this.largura = imagem.getWidth(null);
        this.alrgura = imagem.getHeight(null);
    }

    public void update(){//velocidade tiro
        this.x += VELOCIDADE;
        if(this.x > LARGURA){
            isVisivel = false;
        }
    }

    public int getY(){
        return y;
    }

    public int getX(){
        return x;
    }

    public static void setVELOCIDADE(int vELOCIDADE){
        VELOCIDADE = vELOCIDADE;
    }

    public static int getVELOCIDADE(){
        return VELOCIDADE;
    }

    public void setVisivel(boolean isVisivel){
        this.isVisivel = isVisivel;
    }

    public boolean isVisivel(){
        return isVisivel;
    }
    
}