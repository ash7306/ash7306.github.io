import java.util.Scanner; // Scanner 클래스 포함
	// java.util : 패키지		 Scanner란 클래스를 패키지에서 가져옴
public class Add2 {
	public static void main(String[] args){
	//메인 메소드에서부터 실행이 시작된다.	
		Scanner input= new Scanner(System.in);
		/*
		Scanner(타입)input(이름)-변수선언 = Instance(new Scanner(System.in))
		Scanner(클래스:자바개발자들이 만들어놓음)
		사용자로부터 '입력'을 받기위해 Scanner의 Instance를 생성한다.
		한 문장으로 값을 바로 넣어서 '초기화'시킴 ex) int a = 10;
		*/
		
		int x;
		int y;
		int sum;
		
		System.out.print("첫번째 숫자를 입력하시오: "); // 입력안내출력
		x = input.nextInt(); //input안에 있는 nextInt메소드를 호출
							//" "호출이 먼저 되고 그다음 프로그램이 멈춘것처럼 대기하다가
							//숫자를 치고 엔터를 치면 '스캐너'가 입력한 숫자를
							//(x = input.nextInt();)에 가지고옴
		System.out.print("두번째 숫자를 입력하시오: "); // 
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.println("결과는: " + sum);
	} // 메소드의 끝
} // 클래스의 끝