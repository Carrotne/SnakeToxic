
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class FrameScreen extends JFrame{
    
    GameScreen gameScreen;
    
    public FrameScreen(){
        gameScreen = new GameScreen();
        add(gameScreen);
    }
    
    public static void main(String[] args) {
        FrameScreen f = new FrameScreen();
        f.setVisible(true);
        f.setSize(500,500);
        
    }
    
}
