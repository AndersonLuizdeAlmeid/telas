package mygame.Modelo;

import java.awt.Image;

public class Fase extends JPanel implements ActionListener {// Atualiza a tela quando o player for se movendo

    private Image fundo;
    private Player player;
    private Timer timer;
    
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
    }

    public void paint(Graphics g){
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0, 0, null);
        graficos.drawImage(player.getImage(), player.getX(), player.getY(), this);
        g.dispose(); // Pinta na tela a imagem
    }

    @Override
    public void actionPerformed(ActionEvent e){ 
        player.update();//método para atualizar a tela
        repaint(); // Sempre que se mover ele vai repintar
    }

    private class TecladoAdapter extends KeyAdapter(){


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