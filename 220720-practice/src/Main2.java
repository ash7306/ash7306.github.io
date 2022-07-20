import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main2 extends JFrame{
	public Main2() {
		JFrame fr = new JFrame("This 프레임");
		JPanel pn = new JPanel();
		JButton[] bt = new JButton[4];

		GridLayout gl = new GridLayout(2, 2);
		pn.setLayout(gl);

		for (int i = 0; i < bt.length; i++) {
			bt[i] = new JButton("Button" + i);
			pn.add(bt[i]);
		}
		JTextArea ja = new JTextArea(7, 15);
		JTextField tf = new JTextField(20);
		
		pn.add(ja);
		
		pn.add(bt[0]);
		pn.add(bt[1]);
		pn.add(bt[2]);
		pn.add(bt[3]);

		fr.setContentPane(pn);

		fr.setSize(1000, 800);
		fr.setVisible(true);
	}

	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
