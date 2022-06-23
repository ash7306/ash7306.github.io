import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.soap.Text;

public class Main7 extends JFrame {
	public Main7() {
		JPanel pnlTop = new JPanel();
		//컴포넌트 들을 가지고 잇다가 보여주는 친구
		JPanel pnlBottom = new JPanel();
		JPanel pnlBox = new JPanel();

		//배치관리 (크기 위치 모양) 
		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);
		//pnlBox y축으로 정렬
		
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);
		//pnlBox패널에 탑 바텀 패널을 집어 넣고 있음

		//사용자의 입력을 받을수 있는 친구들 텍스트필드
		JTextField tf1 = new JTextField(20);//int 값은 가로 길이
		JTextField tf2 = new JTextField(20);
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");

		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//겟 텍스트는 사용자가 입력한 값을 그대로 출력해줌
//				System.out.println(tf1.getText());
				
				//부가적으로 뜨는 창 : 다이올로그
				String text = tf1.getText();
				tf2.setText(text);//get 말고 set도 됨
				JOptionPane.showMessageDialog(Main7.this, text);
				//(this, text)만 하면 this가 에러남  ==> btn1.addActionListener가 컴퍼넌트가 아니라서
				//그래서 (클래스이름.this)를 하면 바깥에 있는 자기 자신의 참조를 전달함
				
			}
		});
		
		pnlTop.add(tf1);
		pnlTop.add(btn1);
		pnlBottom.add(tf2);
		pnlBottom.add(btn2);		
		
		add(pnlBox);
		
		pack();	//컴포넌트를 외부의 박스에 맞게 크기를 조절해 준다
		setDefaultCloseOperation(3);

	}
	public static void main(String[] args) {
		new Main7().setVisible(true);
	}
}
