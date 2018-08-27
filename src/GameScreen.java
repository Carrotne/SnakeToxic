
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class GameScreen extends JPanel implements Runnable{
    int a =0 ;
    Thread thread;
    
    public GameScreen(){
        thread = new Thread(this);
        thread.start();
        run();
    }
    public void paint(Graphics g){
       g.setColor(Color.white);
       g.fillRect(0, 0, 500, 500);
       g.setColor(Color.blue);
       g.fillRect(a, 10, 100, 100);
    }
    public void run(){
        while(true){
            try {
                a++;
                repaint();
                thread.sleep(20);
            } catch (InterruptedException ex) {}         
        }
    }
    
}
