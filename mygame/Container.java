package gamewindow;

import javax.swing.Jframe;

public class Container extends Jframe {

    public Container(){
        add (new fase());// Cria o fundo
        setTitle("Game"); //Nome da tela
        setSize(1024,728);//Tamanho da Tela
        setDefaultCloseOperation(Jframe.exit on close); //Fechar a tela
        setLocationRelativeTo(null); //Ponto da tela que vai aparecer ao iniciar .. NULL = CENTRO
        this.setResizable(false);//Controla a tela "Maximizar ou  diminuir resolução"
        setVisible(true);//Definir que série de comandos seja visivel
        
    }
        
        public static void main (String []args){
            new Container();
        }
}


