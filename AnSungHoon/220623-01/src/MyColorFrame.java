import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// 클릭을 했을때 동작을 할수 잇게끔
		System.out.println("사용자가 버튼 누름");

	}
}

public class MyColorFrame extends JFrame {
	public MyColorFrame() {
		super("색깔 있는 프레임");

//		JPanel은 컨테이너의 역할을 하는 객체
		JPanel pn1 = new JPanel();
//		모양은 없지만 다른 컨포넌트를 추가해서 보여주게 함	

//		빈판에 색깔을 변경함
		pn1.setBackground(Color.GREEN);

		JButton btn = new JButton("컨테이너안의 버튼");

		btn.addActionListener(new MyActionListener() {
			//무명 클래스로 사용 가능
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭을 했을때 동작을 할수 잇게끔
//				System.out.println("사용자가 버튼 누름");
				pn1.setBackground(Color.BLUE);
			}
		});

//		빈판에 버튼도 추가함
		pn1.add(btn);

		add(pn1);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		MyColorFrame f = new MyColorFrame();

		f.setVisible(true);
	}
}
