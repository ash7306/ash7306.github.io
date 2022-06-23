import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter2 extends JFrame implements ActionListener {
	private int number = 0;
	private final int NUM = 10;
	private JButton btn;
	private JButton btn2;
	private JLabel lbl;
	private JPanel pnl;

	// 숫자도 버튼도 먼가 보여줄수 있는 레이블도 필드로 가지고 있다

	public MyCounter2() {

		super("카운터");

		JPanel pnl = new JPanel();
		lbl = new JLabel("0");
		btn = new JButton("증가");
		btn2 = new JButton("감소");

//		//익명의 액션 클래스를 만듦
//		ActionListener aListener = new ActionListener() {
//		//actionPerformed 이하나만 , 구현만 되어 있으면 된다
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				//이벤트가 발생된 객체의 참조를 알려줌
//				if (e.getSource() == btn) {
//					number++;
//				} else {
//					number--;
//				}	
//				//참조를 비교해서 이벤트를 실행시킴
//				
//				lbl.setText(String.valueOf(number));
//			}
//		};

		btn.addActionListener(this);
		btn2.addActionListener(this);

		pnl.add(lbl);
		pnl.add(btn);
		pnl.add(btn2);

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			number++;
			if (number == NUM) {
				lbl.setText("그만눌러 20이면 종료임");
				pnl.setBackground(Color.RED);
			} else if (number == NUM * 2) {
				System.exit(0);
			}
		} else {
			number--;
		}
		lbl.setText(String.valueOf(number));
	}

	public static void main(String[] args) {
		new MyCounter2().setVisible(true);
	}

}
