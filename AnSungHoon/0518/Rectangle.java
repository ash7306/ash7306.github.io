//사용자의 사각형의 밑변과 높이를 정수로 입력
//사각형의 둘레와 넓이를 출력

//둘레는 (밑변+높이) * 2
//넓이는 (밑변*높이)
import java.util.Scanner; 
//*****Scanner사용을 위한 import 꼭 넣기!!!

public class Rectangle {
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
	
		System.out.println("사각형의 둘레와 넓이 구하기"); 
		
		System.out.print("사각형의 밑변을 입력하시오: "); 
		int length = input.nextInt();
		
		System.out.print("사각형의 높이을 입력하시오: "); 
		int height = input.nextInt();
		
		int x = (length + height)*2 ;
		int y = (length * height);
		
		System.out.println("둘레: " + x);
		System.out.println("넓이: " + y);
	}
}		
