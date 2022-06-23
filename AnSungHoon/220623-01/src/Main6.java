import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main6 extends JFrame{
	public Main6() {
		JPanel pnl = new JPanel();
		FlowLayout flow = new FlowLayout(FlowLayout.LEFT);
		pnl.setLayout(flow);
		//panel은 기본값이 setLayout(flow) 를 가진다
		//따로 설정하지 않아도 중앙에 가로로 정렬하기 떄문
		
//		BorderLayout border = new BorderLayout();
//		pnl.setLayout(border);
		//보더레이아웃은 add를 하면 자기의 영역에 컴퍼넌트를 가득 채운다
		
//		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);	//x방향으로
//		pnl.setLayout(box);
		//박스를 차곡차곡 쌓게 해줌
		//근데 그 방향을 내가 정해줄 수 있음
		
//		GridLayout grid = new GridLayout(2, 2);
//		pnl.setLayout(grid);		
		//생성자에서 몇줄 몇칸인지 정해주고 그에 맞춰서 
		//똑같은 컴퍼넌트를 채워줌
		//크기에 대한 설정은 무시한다
		
		
		//버튼의 위치와 크기들의 값을 없앰
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		
		pnl.setLayout(null);
		btn1.setLocation(10, 30);
		btn1.setSize(200, 300);
		btn2.setBounds(220, 50, 90, 40);
		//				위치       /   크기
		
		//프리페레즈 사이즈 ;최대한 그값을 적용시켜 줄려고 한다
		btn1.setPreferredSize(new Dimension(300,300));		
		btn1.setMinimumSize(new Dimension(300, 300));
		btn1.setMinimumSize(new Dimension(300, 300));
		
		pnl.add(btn1, "West");
		pnl.add(btn2);
		pnl.add(btn3, "East");
		pnl.add(btn3, "South");
		//두번 위치를 잡으면 제일 마지막에 추가시킨걸 적용함
		//위치를 잡아주지않아서 버튼1위에 버튼2위에 버튼3이 있는것임
		
		add(pnl);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main6().setVisible(true);
	}
}
