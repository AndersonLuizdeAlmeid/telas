package mygame.Modelo;

import java.awt.Image;
import java.util.List;

import meujogo.Modelo.Enemy1;
import meujogo.Modelo.Tiro;

public class Fase extends JPanel implements ActionListener {// Atualiza a tela quando o player for se movendo

    private Image fundo;
    private Player player;
    private Timer timer;
    private List<Enemy1> enemy1;
    
    public Fase(){

        setFocusable(true);
        setDioubleBuffered(true);

        ImageIcon referencia = new ImageIcon("res\\background.jpg"); // instancia referencia como imagem
        fundo = referencia.getImage();// Pega a imagem e transforma em fundo

        player = new Player();
        player.load();// Carrega imagem do player
    
        addKeyListener(new TecladoAdapter());

        timer = new Timer(5, this);
        timer.start();

        inicializaInimigos();
    }

    public void inicializaInimigos(){
        int coordenadas[] = new int[40];
        enemy1 = new ArrayList<Enemy1>();

        for(int i = 0 ; i < coordenadas.lenght; i++){
            int x = (int)(Math.random() * 8000 + 1024);
            int y = (int)(Math.random() * 650 + 30);
            enemy1.add(new Enemy1(x, y));
        }
    }

    public void paint(Graphics g){
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0, 0, null);
        graficos.drawImage(player.getImage(), player.getX(), player.getY(), this);

        List<Tiro> tiros = player.getTiros();
        for(int i = 0; i < tiros.size(); i++){
            Tiro m = tiros.get(i);
            m.load();
            graficos.drawImage(m.getImage(),m.getX(), m.getY(), this);
        }

        for(int o = 0; o < enemy1.size(); o++){
            Enemy1 in = enemy1.get(o);
                in.load();
                graphicos.drawImage(in.getImage(), in.getX(), in.getY(), this);
            
        }

        g.dispose(); // Pinta na tela a imagem
    }

    @Override
    public void actionPerformed(ActionEvent e){ 
        player.update();//método para atualizar a tela
        List<Tiro> tiros = player.getTiros();
        for(int i = 0; i< tiros.size(); i++){
            Tiro m = tiros.get(i);
                if(m.isVisivel()){
                    m.update();
                } else {
                    tiros.remove(i);
                }

            for(int o = 0; i< enemy1.size; o++){
                Enemy1 in = enemy1.get(o);
                    if (in.isVisivel()){
                        in.update();
                    } else{
                        enemy1.remove(o);
                    }
            }
        }
        repaint(); // Sempre que se mover ele vai repintar
    }

    private class TecladoAdapter extends KeyAdapter{

        @Override
        public void keyPressed(KeyEvent e){
            player.keyPressed(e);
        }

        @Override
        public void keyRelease(KeyEvent e){
            player.keyRelease(e);
        }
    }

}