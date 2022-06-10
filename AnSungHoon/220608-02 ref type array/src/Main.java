// 참조형 타입의 배열

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		String[] arr = new String[3];
		arr[0] = "ABC";
		arr[1] = "DEF";
		arr[2] = "GHI";
				
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(Arrays.toString(arr));
		// 값이 들어가 있는게 아니라 ABC, DEF 를 각각 참조하고 있는 형태
	}
}
