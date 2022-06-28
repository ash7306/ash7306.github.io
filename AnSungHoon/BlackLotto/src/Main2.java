import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

public class Main2 extends JFrame {
	public Main2() {
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		JLabel lblNewLabel = new JLabel("New label");
		getContentPane().add(lblNewLabel);
	}

}
