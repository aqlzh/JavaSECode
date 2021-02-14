package cn.lzh.qqLogin;
import java.awt.*;
import javax.swing.*;

public class CreatePanel {  
    private static LoginListener ll =null;
    /**

     * @param jf  QQ��¼���洰�ڶ���
     * @return    ���ش����ĵ�ǰ����������
     */
    public static JPanel CreateNorthPanel(JFrame jf){  

        JPanel panel=new JPanel();  

        panel.setLayout(null);     

        panel.setPreferredSize(new Dimension(0, 140));  

        ImageIcon image=new ImageIcon("images/back.jpg");  
        JLabel background=new JLabel(image);  

        background.setBounds(0,0,426,image.getIconHeight());     
        panel.add(background);  

		JButton out = new JButton(new ImageIcon("images/close_normal.jpg"));
		out.setBounds(403,0,26,26);

		out.setRolloverIcon(new ImageIcon("images/close_hover.jpg"));

		out.setBorderPainted(false);
		panel.add(out);

		out.addActionListener(event -> jf.dispose());
        return panel;  
    }  
    /** 
     * ����������QQ��¼������಼�����
     * @return  ���ش����ĵ�ǰ���������
     */
    public static JPanel CreateWestPanel(){

        JPanel panel=new JPanel();
        panel.setLayout(null);  
        panel.setPreferredSize(new Dimension(130,0));  

        ImageIcon image=new ImageIcon("images/qq.jpg");  
        JLabel  background=new JLabel(image);  
        background.setBounds(0, 0, 120, 110);  
        panel.add(background);  
        return panel;  
    }  
    /**
     * ����������QQ��¼�����в��������
     * @param jf  QQ��¼���洰�ڶ���
     * @return    ���ش����ĵ�ǰ�в�������
     */
    public static JPanel CrateCenterPanel(JFrame jf){  

        JPanel panel = new JPanel();  
        panel.setLayout(null);  

        String str []= {"123456789","987654321","1314520888"};  
        JComboBox<Object> jcoCenter = new JComboBox<Object>(str);  
        panel.add(jcoCenter);  

        jcoCenter.setEditable(true);  
        jcoCenter.setBounds(0, 15, 175, 30);

        jcoCenter.setFont(new Font("Calibri ",0,13));  

        JPasswordField jpaCenter = new JPasswordField();  

        jpaCenter.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));  
        jpaCenter.setBounds(0, 44, 175, 30);  
        jpaCenter.setPreferredSize(new Dimension(185,25)); 
        panel.add(jpaCenter); 

        ImageIcon image = new ImageIcon("images/keyboard.jpg");
        JButton jbu = new JButton(image);  
        jbu.setPreferredSize(new Dimension(22,20));  
        jbu.setBorderPainted(false);  
        jpaCenter.add(jbu);  

        JCheckBox jch1 = new JCheckBox("��ס����"); 

        jch1.setFocusPainted(false); 
        jch1.setFont(new Font("����",0,13));
        jch1.setBounds(0, 85, 80, 20);  
        panel.add(jch1);  
        JCheckBox jch2 = new JCheckBox("�Զ���¼");  
        jch2.setFocusPainted(false);  
        jch2.setFont(new Font("����",0,12));  
        jch2.setBounds(100, 85, 80, 20);  
        panel.add(jch2);  

        ll = new LoginListener(jcoCenter, jpaCenter, jf);
        return panel;  
    }  
    /**
     * ����������QQ��¼�����Ҳ಼����� 
     * @return ���ش����ĵ�ǰ�Ҳ�������
     */
    public static JPanel CrateEastPanel(){

        JPanel panel=new JPanel();  
        panel.setLayout(null);  
        panel.setPreferredSize(new Dimension(100, 0));  

        JLabel regeist=new JLabel("ע���˺�");  
        regeist.setForeground(new Color(100,149,238));  
        regeist.setBounds(0, 13, 60, 30);  
        regeist.setFont(new Font("����",0,12));  

        JLabel regetpwd=new JLabel("�һ�����");  
        regetpwd.setForeground(new Color(100,149,238));  
        regetpwd.setBounds(0, 43, 60, 30);  
        regetpwd.setFont(new Font("����",0,12));  
        panel.add(regetpwd);  
        panel.add(regeist);  
        return panel;  
    }  
    /**
     * ����������QQ��¼����ײ��������
     * @return ���ش����ĵ�ǰ�ײ�������
     */
    public static JPanel CreateSouthPanel(){  

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(0,51));  
        panel.setLayout(null);  

        JButton jble = new JButton(
        		new ImageIcon("images/single_normal.jpg"));  
        jble.setPreferredSize(new Dimension(40,40));  
        jble.setFocusPainted(false);  
        jble.setRolloverIcon(new ImageIcon("images/single_down.jpg"));  
        jble.setBorderPainted(false);  

        jble.setContentAreaFilled(false);  
        jble.setBounds(0,10,40,40);  
        jble.setToolTipText("���˺ŵ�¼");  

        ImageIcon image = new ImageIcon("images/login_normal.jpg");  
        JButton jb = new JButton("��     ¼",image);  
        jb.setFont(new Font("����",0,13));
        jb.setBounds(130,0,175,40);

        jb.setHorizontalTextPosition(SwingConstants.CENTER);
        jb.setFocusPainted(false);  
        jb.setContentAreaFilled(false); 
        jb.setBorderPainted(false);  
        jb.setRolloverIcon(new ImageIcon("images/login_hover.jpg"));  

        JButton jbri = new JButton(
        			new ImageIcon("images/right_normal.jpg")); 
        jbri.setBounds(380,10,40,40);
        jbri.setFocusPainted(false); 
        jbri.setBorderPainted(false);  
        jbri.setContentAreaFilled(false);  
        jbri.setRolloverIcon(new ImageIcon("images/right_hover.jpg"));  
        jbri.setToolTipText("��ά���¼"); 

        panel.add(jble);  
        panel.add(jb);  
        panel.add(jbri);         

        jb.addActionListener(ll);
        return panel;  
    }  
}  