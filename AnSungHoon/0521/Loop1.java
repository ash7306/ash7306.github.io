// 1 ~ 10까지 출력하세요.
public class Loop1 {
	public static void main(String[] args) {
		boolean con = true;				
		//while ()안의 참과 거짓을 보고 참이면 {}안으로 들어감 {}끝을 만나면 다시 첨으로 돌아감
		//false가 되면 반복이 중단
		int i = 0;
		while (i < 10) {
			System.out.println("반복됩니다.");
			i++;
		}
		
		int j = 0;
		while (j < 10) {
			System.out.println("hello world");
			System.out.println("j:" + j);
			j++;
		}
		
		int k = 1;
		while (k <= 10) {
			System.out.println(k);
			k++;
		}
	}
}