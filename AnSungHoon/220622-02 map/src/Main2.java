import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		//뒤에 있는 제네릭은 앞에있는 제네릭을 그대로 따라간다 문법상 비워둠
		//Map이라는 구현체 밑에 Hash라는 구현체가 있다
		
		map.put("둘리", 100);
		map.put("홍", 90);
		map.put("도", 150);
		//중복되지 않는 유일한 값을 이름으로
		System.out.println(map);
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(100, "둘리");
		map2.put(90, "홍");
		map2.put(150, "도");
		//유일한 값을 정수로 
		System.out.println(map2);
		
		//키값은 중복된 애들이 없으니까 Set
		//고유한 키값들을 Set으로 만든것
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		
		while(iter.hasNext()) {
		//키값이 있냐
			String key = iter.next();
			//다음 키
			Integer value = map.get(key);
			//그 키의 값
			
			System.out.println(key + "=" + value);
		}		
		
		for (String key1 : map.keySet()) {
			System.out.println(key1 + "=" + map.get(key1));
		}
		
		//entry : 짝꿍을 말하는 객체 (다른 언어에서는 pair 라고함)
		// Set<> entrySet = map.entrySet(); set임
		Set<Entry<String, Integer>> entrySet = map.entrySet();				
		for (Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
		
		
		
	}
}
