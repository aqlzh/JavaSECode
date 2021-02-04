package FinalTest;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class CompanyShowByJTable {
    private static void  createAndShowGUI(){
        JFrame f = new JFrame("PanelDemo") ;
        f.setLayout(new BorderLayout());
        f.setSize(350,200);
        f.setLocation(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyJPanel panel = new MyJPanel() ;
        f.add(panel,BorderLayout.CENTER) ;

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CompanyShowByJTable::createAndShowGUI);
    }
}

class MyJPanel extends  JPanel{


    public MyJPanel(){
        super();
        JButton bt1 =  new JButton("show records") ;
        this.add(bt1) ;
        this.add(new JButton("按钮2")) ;
        this.add(new JButton("按钮3")) ;
        this.add(new JButton("按钮4")) ;
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.RED);
        g.setFont(new Font("Default",Font.BOLD,30));
        
        g.fillRect(20,50,1200,20);

        ArrayList list = FinalTest.CompanyMysqlDemo.getResultSetString() ;

        for(int i = 0 ;  i < list.size() ;i++ ){
            Company comp = (Company) list.get(i) ;
            StringBuffer str = new StringBuffer() ;
            str.append(comp.getId() + "------") ;
            str.append(comp.getName() + "------") ;
            str.append(comp.getAge() + "------") ;
            str.append(comp.getAddress() + "------") ;
            str.append(comp.getSalary() + "------") ;
            g.drawString(str.toString(),20,100+30*i);
        }
    }
}
