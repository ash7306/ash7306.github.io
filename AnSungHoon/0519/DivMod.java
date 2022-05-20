import java.util.Scanner;

public class DivMod {	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오.");
		int large = input.nextInt(); 
		System.out.print("다음 정수를 입력하시오.");
		int small = input.nextInt();
	
		
				
		// System.out.print(large + "을" + small + "으로 나눈 몫은"
					  // + (large / small) + "이고 나머지는"
					  // + (large % small) + "입니다.");
		
		System.out.printf("%d을 %d으로 나눈 몫은 %d이고 나머지는 %d입니다.",
						large, small, large/small, large % small);				  
				  
		// System.out.printf("%dHello %dWorld%d\n", 3, 5, 6);
		// System.out.printf("Hello %dWorld", 2);		
		// printf에만 사용할 수 있는 코드 - %d
		// %d : 앞에 숫자가 하나 올거라고 명시 그다음 쉼표로 순서별 값 입력
	}
}