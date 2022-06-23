import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame2 extends JFrame {
	public MyFrame2(String title) {
		super(title);

		setSize(500, 500);
		setDefaultCloseOperation(3);
	}
}

public class Main3 {
	public static void main(String[] args) {
		MyFrame2 frame = new MyFrame2("나만의 프레임");

		frame.setVisible(true);
		frame.getContentPane().add(new JLabel("Hello world"));
		
		
	}
}
