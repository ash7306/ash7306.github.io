
public class Main2 {

	public static void main(String[] args) {
		// 길이가 5인 정수(int)형 배열을 선언 초기화 하고
		// 모든 원소(element)의 값을 100으로 설정해보세요.
		// 원소는 배열의 하나의 값을 말함
		
		int[] aBox = new int[5];
		
		int idx = 0;
		aBox[idx] = 100;
		idx++;
		System.out.println(idx);
		aBox[idx] = 100;
		idx++;
		System.out.println(idx);
		aBox[idx] = 100;
		idx++;
		System.out.println(idx);
		aBox[idx] = 100;
		idx++;
		System.out.println(idx);
		aBox[idx] = 100;
		idx++;
		
		
		for (int i = 0; i < aBox.length; i++) {
			aBox[i] = 100;
			System.out.println(i + "번째 index의 원소값: " + aBox[i]);
		}
			

		
		
		
	}

}
