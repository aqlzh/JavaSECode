package lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class KeyEventDemo extends JFrame{

    private KeyboarPanel panel = new KeyboarPanel();
    public KeyEventDemo(){
        add(panel);
        panel.setFocusable(true);
        this.setVisible(true);
        this.setSize(300, 300);

    }

    public static void main(String[] args) {
        new KeyEventDemo();

    }

}

// inner class
class KeyboarPanel extends JPanel{
    private int x =100;
    private int y =100;
    private int r =100;
    private char keychar ='A';
    public KeyboarPanel(){
        this.addKeyListener(new KeyAdapter(){
            public void keyPressed( KeyEvent e){

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_DOWN: y=y+10;break;
                    case KeyEvent.VK_UP:   y=y-10;break;
                    case KeyEvent.VK_LEFT: x=x-10;break;
                    case KeyEvent.VK_RIGHT: x=x+10;break;
                    case KeyEvent.VK_A: r=r+10 ;break;
                    case KeyEvent.VK_S: r=r-10 ;break;

                    default:

                }
                repaint();
            }

        });
    }


    /**  draw the character **/
    public void paint( Graphics g){
        super.paint(g);

        double one = Math.PI / 180;
        for (int i = 0; i < 360; i++) {

            int x1 = (int) (x + r * Math.cos(one * i));
            int y1 = (int) (y - r * Math.sin(one * i));
            g.drawString(".", x1, y1);
        }


        g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
        g.drawString(String.valueOf(keychar), x, y);


    }

}//end inner class
