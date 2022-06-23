import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

class MyFrame extends JFrame {
	public MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("MyFrame");
				
		JButton button = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		//버튼에 들어갈 내용을 문자열로 넣어줌
//		getContentPane().setLayout(new FlowLayout());	
//		getContentPane().add(button);
		//getContentPane(). 이 생략되어 있다.
		
				
		setBackground(new Color(255, 0, 0));
		
		setLayout(new FlowLayout());
		//위치를 정해줌
		//일자로 정렬
		add(button);
		add(button2);
		setVisible(true);
		
	}
}

public class MyFrameTest1 {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
