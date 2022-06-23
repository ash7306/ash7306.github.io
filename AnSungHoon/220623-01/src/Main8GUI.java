import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main8GUI extends JFrame {
	private int x;
	private int y;
	private int z;
	

	public Main8GUI() {
		super("재밌는 연산 게임");
		Random ran = new Random();
		
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();
		JPanel pnlBox = new JPanel();// 전체 박스
		// 랜덤 문제

		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);

		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);

		JTextField tf1 = new JTextField(18);// int 값은 가로 길이
		JTextField tf2 = new JTextField(13);
		JLabel lbl = new JLabel();
		JButton btn0 = new JButton("문제");
		JButton btn1 = new JButton("확인");
		JButton btn2 = new JButton("리셋");

		// 문제
		btn0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				x = ran.nextInt(9);
				y = ran.nextInt(9);
				z = ran.nextInt(3);
				String quiz;

				if (z == 0) {
					quiz = (x + 1) + "+" + (y + 1) + "=";
				} else if (z == 1) {
					quiz = (x + 1) + "-" + (y + 1) + "=";
				} else {
					quiz = (x + 1) + "x" + (y + 1) + "=";
				}

				tf1.setText(quiz);
				// JOptionPane.showMessageDialog(Main8GUI.this, text);
			}
		});

		// 정답
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int quizAnswer;
				if (z == 0) {
					quizAnswer = x + y + 2;
				} else if (z == 1) {
					quizAnswer = x - y;
				} else {
					quizAnswer = (x + 1) * (y + 1) ;
				}
				
				String text = tf2.getText();				
				String q = Integer.toString(quizAnswer);
				
				if (text.equals(q)) {
					JOptionPane.showMessageDialog(Main8GUI.this, "정답");
					lbl.setText("정답");
				} else {
					JOptionPane.showMessageDialog(Main8GUI.this, "땡, 틀림");
					lbl.setText("오답");
				}
			}
		});

		// 리셋 버튼
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				tf2.setText("");
				lbl.setText("");
			}
		});

		pnlTop.add(tf1);
		pnlTop.add(btn0);
		pnlBottom.add(tf2);
		pnlBottom.add(btn1);
		pnlBottom.add(lbl);
		pnlBottom.add(btn2);

		add(pnlBox);
		JOptionPane.showMessageDialog(Main8GUI.this, "퀴즈를 시작합니다.");		
		setSize(300, 180);
//		pack(); // 컴포넌트를 외부의 박스에 맞게 크기를 조절해 준다
		setDefaultCloseOperation(3);
	}

	public static void main(String[] args) {
		new Main8GUI().setVisible(true);
	}
}
