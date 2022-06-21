import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class main9 {
	public static boolean isNumberChar(char c) {
		return c >= '0' && c <= '9';		
	}
	
	public static boolean isNumberStr(String s) {
		for (int i = 0; i < s.length(); i++) {
			if(isNumberChar(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "carrot", "donut", "egg"));
		//1.위 리스트에서 문자열 길이가 5글자인 문자열만을 원소로 가지는 리스트 생성
		//2.문자열 중에 'e' 문자를 포함하는 문자열만 원소로 가지는 리스트
		
		//1
		//복사본 만들어서 지우던가
		//빈 새리스트를 만들어서 채우던지 
		List<String> copy = new ArrayList(list);
		Iterator<String> iterator = copy.iterator();		
				
		while (iterator.hasNext()) {
			String str = iterator.next();
			if (str.length() != 5) {
				iterator.remove();
			}
		}
		System.out.println(copy);
						
		//2
		List<String> empty = new ArrayList<>();
		//빈 리스트를 먼저 만들고
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if(str.contains("e")) {
				empty.add(str);
			}
		}
		System.out.println(empty);
					
		
		List<String> list2 = new ArrayList<>(Arrays.asList("가", "1", "@", "3", "나", "1000"));
		//3. 정수 형태의 값을 가지는 문자열을 찾아  해당 원소를 가지는 정수형 리스트 생성
				
		//3
		List<Integer> listInteger = new ArrayList<>();
		
//		for (int i = 0; i < list2.size(); i++) {
//			String str = list2.get(i);
//			try {
//				Integer value = Integer.valueOf(str);
//				listInteger.add(value);
//			} catch (NumberFormatException e) {
//				System.out.println("문자열을 정수형으로 변환하는데 실패하여 예외가 발생했으나 정상흐름으로 돌아가기를 원해 예외 처리를 하였음");
//			}
//		}
//		System.out.println(listInteger);
		
		for (int i = 0; i < list2.size(); i++) {
			String str = list2.get(i);			
			if (isNumberStr(str)) {
				listInteger.add(Integer.valueOf(str));
			}
		}
		System.out.println(listInteger);
	}
}
