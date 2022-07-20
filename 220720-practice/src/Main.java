import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Main extends JFrame {
	public Main() {
		JFrame fr = new JFrame("This 프레임");
		

		JPanel pnlMain = new JPanel();
		JPanel pnlLEFT = new JPanel();
		JPanel pnlRight = new JPanel();
		JPanel pnltf = new JPanel();
		JPanel pnlbtn = new JPanel();
		
		fr.setContentPane(pnlMain);
		// 왼쪽패널 
		JTextArea ja = new JTextArea(10, 20);
		JTextField tf = new JTextField();
		JButton btn0 = new JButton("확인");
		JButton btn1 = new JButton("힌트");
		JButton btn2 = new JButton("즐겨찾기");
		JButton btn3 = new JButton("랭킹보기");
		
		// 오른쪽패널
		JPanel pnlRight1 = new JPanel();
		JPanel pnlRight2 = new JPanel();
		
//		pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.X_AXIS));
//		pnlLEFT.setLayout(new BoxLayout(pnlLEFT, BoxLayout.Y_AXIS));
//		pnlRight.setLayout(new BoxLayout(pnlRight, BoxLayout.Y_AXIS));
		
		pnlLEFT.setBorder(new TitledBorder(new LineBorder(Color.BLUE,3),"문제"));
		pnlRight.setBorder(new TitledBorder(new LineBorder(Color.BLUE,3),"기타"));

//		add(pnlMain);
		add(pnlLEFT);
		add(pnlRight);

		//왼쪽 상
		pnlLEFT.add(ja);
		//왼쪽 중
		pnltf.add(tf);
		pnltf.add(btn0);
		//왼쪽 하
		pnlbtn.add(btn1);
		pnlbtn.add(btn2);
		pnlbtn.add(btn3);
		
		pnlRight.add(pnlRight1);
		pnlRight.add(pnlRight2);
		
		fr.setSize(1000, 800);
		pnlLEFT.setSize(900, 350);
		pnlRight.setSize(900, 350);
		
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setResizable(false);
//		pack();
		
		JButton[] bt = new JButton[4];

//		for (int i = 0; i < bt.length; i++) {
//			bt[i] = new JButton("Button" + i);
//			pn.add(bt[i]);
//		}
//		JTextArea ja = new JTextArea(7, 15);
//		JTextField tf = new JTextField(20);
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
