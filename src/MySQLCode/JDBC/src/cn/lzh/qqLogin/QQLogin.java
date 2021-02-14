package cn.lzh.qqLogin;
import java.awt.*;
import javax.swing.*;

public class QQLogin {

	private static JFrame jf = new JFrame();
	public static void initLogin() {
		jf.setSize(426, 300);
		jf.setLocation(497, 242);
		jf.setUndecorated(true);
		jf.setResizable(false);

		BorderLayout border_layout = new BorderLayout();
		jf.setLayout(border_layout);

		JPanel panel_north = CreatePanel.CreateNorthPanel(jf);
		jf.add(panel_north, BorderLayout.PAGE_START);

		JPanel panel_center = CreatePanel.CrateCenterPanel(jf);
		jf.add(panel_center, BorderLayout.CENTER);

		JPanel panel_west = CreatePanel.CreateWestPanel();
		jf.add(panel_west, BorderLayout.LINE_START);

		JPanel panel_south = CreatePanel.CreateSouthPanel();
		jf.add(panel_south, BorderLayout.PAGE_END);

		JPanel pannel_east = CreatePanel.CrateEastPanel();
		jf.add(pannel_east, BorderLayout.LINE_END);
		jf.setVisible(true);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(QQLogin::initLogin);
	}
}