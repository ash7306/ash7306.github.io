import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main4 {
	public static void main(String[] args) {
		String line = "hello. I'm a java developer.";
		Map<Character, Integer> m = new HashMap<>();
				
		System.out.println(line.charAt(0));	
		
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			//	c가 있으면 true
			if(!m.containsKey(c)) {
				m.put(c, 1);
			} else {
				m.put(c, m.get(c) + 1);
			}						
		}		
		System.out.println(m);
		
		
	
//		for (String a : sample) {
//			Integer freq = line.(a); //"to"를 반환함 값이 없으면 null을 반환함
//			m.put(a, (freq == null) ? 1 : freq + 1);			
//		}
	
		
		
//		Map<String, Integer> m = new HashMap<String, Integer>();
//		
//		String[] sample = {"to", "be", "or", "not", "to", "be", "is", "a", "problem" };
//		
//		for (String a : sample) {
//			Integer freq = m.get(a); //"to"를 반환함 값이 없으면 null을 반환함
//			m.put(a, (freq == null) ? 1 : freq + 1);			
//		}
//		
//		System.out.println(m.size() + "단어가있습니다");
//		System.out.println(m.containsKey("to"));
//		System.out.println(m.isEmpty());
//		System.out.println(m);
//
	}
}
