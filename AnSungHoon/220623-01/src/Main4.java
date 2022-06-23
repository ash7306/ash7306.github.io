import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main4 extends JFrame implements ActionListener {
	private JButton btn;
	private JButton btn2;
	private JButton btnEnable;
	private JButton btnDisable;
	private List<JButton> list;

	public Main4() {
		super("버튼활성화테스트");
		list = new ArrayList<>();
		JPanel pnl = new JPanel();
		btnEnable = new JButton("활성화");
		btnDisable = new JButton("비활성화");
		JButton btnNotShown = new JButton("보임?");

		btnEnable.addActionListener(this);
		btnDisable.addActionListener(this);

		// 생성만하고 지역변수라 날아감

//		비활성화
//		btnDisable.setEnabled(false);
		//true면 활성화 false 비활성화
		btnNotShown.setVisible(false);
		//true하면 나오고 false 비활성화
		//이너블은 희미하게나마 자리를 차지하지만
		//비저블은 아예 안보이게 처리함

		pnl.add(btnEnable);
		pnl.add(btnDisable);
		pnl.add(btnNotShown);
		
		for (int i = 1; i <= 5; i++) {
			JButton btn = new JButton(String.valueOf(i));
			pnl.add(btn);

			list.add(btn);
		}
		
		add(pnl);	

		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// getSource 버튼 구별
		if (e.getSource() == btnEnable) {
			// 버튼 5개를 참조해서 전부다 활성화
			for (JButton btn : list) {
				btn.setEnabled(true);
			}
		} else {
			for (JButton btn : list) {
				btn.setEnabled(false);
			}
		}
	}

	public static void main(String[] args) {
		new Main4().setVisible(true);
	}

}
