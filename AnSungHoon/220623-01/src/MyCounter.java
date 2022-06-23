import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter extends JFrame{
	private int number = 0;
	private final int NUM = 10;
	
	
	public MyCounter() {
		super("카운터");
		
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("0");
		JButton btn = new JButton("증가");
		JButton btn2 = new JButton("감소");
		//익명의 액션 클래스를 만듦
		btn.addActionListener(new MyActionListener() {
			//무명 클래스로 사용 가능
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("왼쪽 레이블 숫자 바꿀 예정");
				number++;
				pnl.setBackground(Color.YELLOW);
				//볼수 있게끔 하는 레이블을 설정함 그게 여기선 lbl 이다.
				lbl.setText(String.valueOf(number));
				if (number == NUM) { 
					lbl.setText("그만눌러 20이면 종료임");
					pnl.setBackground(Color.RED);
				} else if (number == NUM * 2) {
					System.exit(0);
				}
			}
		});
		
		btn2.addActionListener(new MyActionListener() {
			//무명 클래스로 사용 가능
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("왼쪽 레이블 숫자 바꿀 예정");
				number--;
				//볼수 있게끔 하는 레이블을 설정함 그게 여기선 lbl 이다.
				lbl.setText(String.valueOf(number));
				if (number < NUM) {					
					pnl.setBackground(Color.GREEN);
				}
			}
		});
				
		pnl.add(lbl);
		pnl.add(btn);
		pnl.add(btn2);
		
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		
	}
	public static void main(String[] args) {
		new MyCounter().setVisible(true);
	}
	
}
