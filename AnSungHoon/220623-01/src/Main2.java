import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main2 {
	// CLI
	//GUI
	//AWT / SWING
	//JavaFX
	//Android
	
	//SWING 순수 자바코드로 만들 수 있음	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		//JFrame은 크기나 위치를 정해주지 않아서 아무것도 안뜸
		frame.setTitle("하이요");
		
		//버튼한개 메뉴한개를 컴퍼넌트 라고 한다
		frame.getContentPane().add(new JLabel("Hello world"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//int값을 받음
											//스태틱 파이널		
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		System.out.println("asdf");
				
	}
}
