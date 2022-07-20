
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Main3 {
	public Main3() {
		JFrame fr = new JFrame("퀴즈 프로그램");
		JPanel pnlMain = new JPanel();
		JPanel pnlLEFT = new JPanel();
		JPanel pnlRight = new JPanel();

		// 문제와 정답을 맞출 텍스트 필드들
		JTextArea ja = new JTextArea(15, 20);
		JTextField tf = new JTextField(20);
		JTextArea ja2 = new JTextArea(20, 30);

		// 왼쪽 버튼
		JButton btn0 = new JButton("확인");
		
		// 오른쪽 버튼
		JButton btn1 = new JButton("힌트");
		JButton btn2 = new JButton("즐겨찾기");
		JButton btn3 = new JButton("랭킹보기");
		JButton btn4 = new JButton("문제추가");
		JButton btn5 = new JButton("문제삭제");
		JButton btn6 = new JButton("문제수정");
		JButton btn7 = new JButton("문제보기");
		
		

		// 왼쪽 객관식 버튼
//		JButton[] bt = new JButton[4];
		JButton[] bt2 = new JButton[4];

		btn1.setBounds(50, 50, 100, 100);
		btn2.setBounds(50, 50, 100, 100);
		btn3.setBounds(150, 50, 100, 100);

		// 왼,오 하위 Panel
		JPanel pnlL1 = new JPanel();
		JPanel pnlL2 = new JPanel();
		JPanel pnlL3 = new JPanel();
		JPanel pnlR1 = new JPanel();
		JPanel pnlR2 = new JPanel();
		JPanel pnlR3 = new JPanel();

		// panel 레이아웃
		pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.X_AXIS));
		pnlLEFT.setLayout(new BoxLayout(pnlLEFT, BoxLayout.Y_AXIS));
		pnlRight.setLayout(new BoxLayout(pnlRight, BoxLayout.Y_AXIS));

		// 테두리
		pnlLEFT.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 3), "문제"));
		pnlRight.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 3), "기타"));

		pnlL1.setBorder(new TitledBorder(new LineBorder(Color.DARK_GRAY, 3), "주관식 "));
		pnlL2.setBorder(new TitledBorder(new LineBorder(Color.DARK_GRAY, 3), "객관식 "));
//		pnlL3.setBorder(new TitledBorder(new LineBorder(Color.DARK_GRAY, 3), "문제 보기"));

		pnlR1.setBorder(new TitledBorder(new LineBorder(Color.RED, 3), "힌트"));
		pnlR2.setBorder(new TitledBorder(new LineBorder(Color.RED, 3), "기능"));
		pnlR3.setBorder(new TitledBorder(new LineBorder(Color.RED, 3), "관리자"));

		// 메인
		fr.setContentPane(pnlMain);
		pnlMain.add(pnlLEFT);
		pnlMain.add(pnlRight);

		// 왼쪽
		pnlLEFT.add(ja);
		pnlLEFT.add(pnlL1);
		pnlLEFT.add(pnlL2);

		// --왼쪽[1]
		pnlL1.add(tf);
		pnlL1.add(btn0);

		// --왼쪽[2]
//		for (int i = 0; i < bt.length; i++) {
//			bt[i] = new JButton((i+1) + "번");
//			pnlL2.add(bt[i]);
//		}

		// 오른쪽
		pnlRight.add(pnlR1);
		pnlRight.add(pnlR2);
		pnlRight.add(pnlR3);

		// --오른쪽[1]
		pnlR1.add(ja2);

		// --오른쪽[2]
		pnlR2.add(btn1);
		pnlR2.add(btn2);
		pnlR2.add(btn3);

		// --오른쪽[3]
		pnlR3.add(btn4);
		pnlR3.add(btn5);
		pnlR3.add(btn6);
		pnlR3.add(btn7);

		multipleChoice(pnlL2);

		fr.setSize(900, 600);
//        pnlRight.setSize(200, 750);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void multipleChoice(JPanel p) {
		GridLayout grid = new GridLayout(2, 2);
		JButton[] bt = new JButton[4];
		
		for (int i = 0; i < bt.length; i++) {
			bt[i] = new JButton((i + 1) + "번");
			p.add(bt[i]);
			p.add(new JTextField(""));
		}
		grid.setVgap(5); // 격자 사이 수직 간격 5 픽셀
		p.setLayout(grid);
//		p.add(new JLabel(" 이름"));
//		
//		p.add(new JLabel(" 학번"));
//		p.add(new JTextField(""));
//		p.add(new JLabel(" 학과"));
//		p.add(new JTextField(""));
//		p.add(new JLabel(" 과목"));
//		p.add(new JTextField(""));
	}

	public static void main(String[] args) {
		new Main3();
	}
}