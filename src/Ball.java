import javax.swing.*;
import java.awt.*;

public class Ball extends JLabel implements Runnable {
    private ImageIcon iconball = new ImageIcon("球.png");

    private Timer t1;
    public Ball(int x ,int y){
        Ball.this.setIcon(iconball);
        Ball.this.setBounds(x, y,80,80);


    }
    @Override
    public void run() {

    }
}