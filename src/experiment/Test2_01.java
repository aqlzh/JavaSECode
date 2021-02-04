package experiment;

import javax.swing.*;
import java.awt.*;

public class Test2_01 extends JFrame {
    int x0 = 300 ;
    int y0 = 300 ;
    int r = 150 ;
    public void paint (Graphics g){
        g.setColor(Color.RED);
        g.setFont(new Font("宋体",Font.BOLD,30));
        double one = Math.PI/180 ;

        for (int i =0;i<5;i++){
            int x1 =(int) (x0+r*Math.cos((90+i*72)*one) );
            int y1 =(int) (y0-r*Math.sin((90+i*72)*one) );
            int x3 =(int) (x0+r*Math.cos((90+i*72+144)*one) );
            int y3 =(int) (y0-r*Math.sin((90+i*72+144)*one) );

            g.drawLine(x1,y1,x3,y3);
        }
    }


    // Test2_01   <-->  JFrameDrawCircle2
    public static void main(String[] args) {
        Test2_01  jf  = new Test2_01() ;
        jf.setSize(600,800);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
