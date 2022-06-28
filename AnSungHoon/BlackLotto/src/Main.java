import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class Main extends JFrame {
	private LineBorder lborder = new LineBorder(Color.black); 
//	JLabel label_8 = new JLabel("       \uAC1C\uBD09\uC608\uC815\uC601\uD654");
//	label_8.setFont(new Font("맑은 고딕", Font.BOLD, 15));
//	label_8.setBorder(bb);    //원하는 라벨에 사용
	public Main() {		
		
		JPanel lastBox = new JPanel();
		JPanel boxTop = new JPanel();
		JPanel boxBot = new JPanel();
		boxTop.setBorder(lborder);
		boxBot.setBorder(lborder);
		
//		lastBox.setBorder(lborder);
//		boxTop.setBorder(lborder);
//		boxBot.setBorder(lborder);
 
		lastBox.setLayout(new BoxLayout(lastBox, BoxLayout.Y_AXIS));
		boxTop.setLayout(new BoxLayout(boxTop, BoxLayout.Y_AXIS));
//		lastBox.setLayout(new BoxLayout(lastBox, BoxLayout.Y_AXIS));
		
//		BoxLayout box3 = new BoxLayout(boxBot, BoxLayout.Y_AXIS);
		
		JLabel lottoRound = new JLabel("로또 제 1회", JLabel.CENTER);
		JLabel winningNum = new JLabel("당첨번호", JLabel.CENTER);
		JLabel winningPrize = new JLabel("5000원 당첨", JLabel.CENTER);
				
		JPanel numBox1 = new JPanel();
		JPanel numBox2 = new JPanel();
		JPanel numBox3 = new JPanel();
		JPanel numBox4 = new JPanel();
		JPanel numBox5 = new JPanel();
		
		JLabel alphabet1 = new JLabel("A", JLabel.LEFT);
		JLabel alphabet2 = new JLabel("B", JLabel.LEFT);
		JLabel alphabet3 = new JLabel("C", JLabel.LEFT);
		JLabel alphabet4 = new JLabel("D", JLabel.LEFT);
		JLabel alphabet5 = new JLabel("E", JLabel.LEFT);
		
		JLabel winningResult1 = new JLabel("당첨");
		JLabel winningResult2 = new JLabel("당첨");
		JLabel winningResult3 = new JLabel("당첨");
		JLabel winningResult4 = new JLabel("당첨");
		JLabel winningResult5 = new JLabel("당첨");
//		winningResult1.setBorder(lborder);
		
		JTextField tf1 = new JTextField(30);
		JTextField tf2 = new JTextField(30);
		JTextField tf3 = new JTextField(30);
		JTextField tf4 = new JTextField(30);
		JTextField tf5 = new JTextField(30);
		
		lastBox.add(boxTop);
		lastBox.add(boxBot);
		boxTop.add(lottoRound);
		boxTop.add(winningNum);
		boxTop.add(winningPrize);

		lottoRound.setPreferredSize(new Dimension(200, 50));
		winningNum.setPreferredSize(new Dimension(200, 50));
		winningPrize.setPreferredSize(new Dimension(200, 50));
		
		boxBot.setLayout(new BoxLayout(boxBot, BoxLayout.Y_AXIS));
//		numBox1.setLayout(new BoxLayout(numBox1, BoxLayout.X_AXIS));
//		numBox2.setLayout(new BoxLayout(numBox2, BoxLayout.X_AXIS));
//		numBox3.setLayout(new BoxLayout(numBox3, BoxLayout.X_AXIS));
//		numBox4.setLayout(new BoxLayout(numBox4, BoxLayout.X_AXIS));
//		numBox5.setLayout(new BoxLayout(numBox5, BoxLayout.X_AXIS));
		numBox1.setPreferredSize(new Dimension(200, 50));
		numBox2.setPreferredSize(new Dimension(200, 50));
		numBox3.setPreferredSize(new Dimension(200, 50));
		numBox4.setPreferredSize(new Dimension(200, 50));
		numBox5.setPreferredSize(new Dimension(200, 50));
		
//		for (int i = 0; i < 5; i++) {
//			JTextField tf = new JTextField(20);
//			boxBot.add(tf);
//		}
		
		boxBot.add(numBox1);
		numBox1.add(alphabet1);
		numBox1.add(winningResult1);
		numBox1.add(tf1);
		boxBot.add(numBox2);
		numBox2.add(alphabet2);
		numBox2.add(winningResult2);
		numBox2.add(tf2);
		boxBot.add(numBox3);
		numBox3.add(alphabet3);
		numBox3.add(winningResult3);
		numBox3.add(tf3);
		boxBot.add(numBox4);
		numBox4.add(alphabet4);
		numBox4.add(winningResult4);
		numBox4.add(tf4);
		boxBot.add(numBox5);
		numBox5.add(alphabet5);
		numBox5.add(winningResult5);
		numBox5.add(tf5);

		setLocationRelativeTo(null);
//		setSize(300, 800);
		add(lastBox);
		pack();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
