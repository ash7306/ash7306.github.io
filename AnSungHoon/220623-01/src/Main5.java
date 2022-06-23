import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main5 extends JFrame {
	public Main5() {
		JPanel pnl = new JPanel();
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		// 액션커멘드라는 문자열도 담아서
		// 아래 actionPerforme에 담는다
		btn1.setActionCommand("임의의 커맨드");
		
		pnl.add(btn1);
		pnl.add(btn2);

		add(pnl);

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
				//그래서 액션커맨드로 구별이 가능함
				//하지만 같은 이름의 버튼은??
				//setActionCommand으로 커맨드를 설정 할 수 있다.
				
			}
		};

		btn1.addActionListener(listener);
		btn2.addActionListener(listener);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Main5().setVisible(true);
	}
}
