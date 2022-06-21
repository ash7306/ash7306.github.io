import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main8 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 23, 35, 11, 23, 57, 79));
		//1.합, 평균
		
		//2.정수 57이 리스트에 있는지? 있으면 몇 번째 index에 위치하는지?
		
		//3.정수 23의 개수
		
		//4.중복되는 원소 23을 '하나' 삭제 하기
		
//		 for (int i : list) {
//			list.remove(Integer.valueOf(i));
//		}
		
		//1
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {			
			sum += list.get(i);
		}
		System.out.println(sum);
		System.out.println(sum/list.size());

		//2
		System.out.println(list.contains(57));		
		System.out.println(list.indexOf(57));
		
		//3
		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == 23) {
				count++;
			}
		}
		System.out.println("23의 개수는: " + count);
		
		//4		
		int index2 = list.indexOf(23);
		//indexOf() 객체만 받음 (object) 그래서 랩핑, 박싱이 필요함 Integer
		//하지만 오토박싱으로 자동으로 23이 변환된것임
//		int index2 = list.lastIndexOf(23);
		
		list.remove(index2);
		System.out.println(list);		
		
		list.remove(Integer.valueOf(23));
		System.out.println(list);
		
//		for(int i = 0; i < list.size(); i++) {			
//			if(list.get(i) == 23) {
//				list.remove(i);
//				count++;
//				if(count == 4) {
//					list.add(i, 23);
//				}
//			}
//		}		
//		System.out.println(list);
		
	}	
}

