package gamewindow;

import javax.swing.JFrame;
import mygame.Modelo.Player;
import mygame.Modelo.Fase;
public class Container extends JFrame {

    public Container(){
        add (new Fase());// Cria o fundo
        setTitle("Game"); //Nome da tela
        setSize(1024,728);//Tamanho da Tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fechar a tela
        setLocationRelativeTo(null); //Ponto da tela que vai aparecer ao iniciar .. NULL = CENTRO
        this.setResizable(false);//Controla a tela "Maximizar ou  diminuir resolução"
        setVisible(true);//Definir que série de comandos seja visivel
        
    }
        
        private void add(Fase fase) {
    }

        public static void main (String []args){
            new Container();
        }

    
}


