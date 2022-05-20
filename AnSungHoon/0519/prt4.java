// 사용자가 3대 측정 : 벤치, 스쿼트, 데드
// 합이 500이상이면 true 아니면 false
import java.util.Scanner;

public class Prt4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("벤치, 스쿼트, 데드 순으로 입력?");
		int x = scan.nextInt();		
		int y = scan.nextInt();		
		int z = scan.nextInt();
		
		int sum = x + y + z ;
		System.out.println(sum >= 500);		
	}
}