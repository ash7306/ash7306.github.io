//사용자의 나이와 이름을 입력받아서 자기랑 같으면 true 출력

import java.util.Scanner;

public class NameAndAge {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("나이를 입력");
		int age = scan.nextInt(); //.nextLine - 한줄을 통째로 가져옴
		System.out.println("이름을 입력");
		scan.nextLine(); //빈 한줄을 통째로 가져옴
		String name = scan.nextLine(); 
		//String name = scan.next();  --> .next - 줄에서 스페이스전까지 가져옴
	
		System.out.println((age == 18) && name.equals("박민"));		
			 
		
	}
}