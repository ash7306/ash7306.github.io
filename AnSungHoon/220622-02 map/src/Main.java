import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("일", 1);
		map.put("이", 2);
		map.put("삼", 3);
		map.put("사", 4);
		
		System.out.println(map.size());
		System.out.println(map.get("일"));
		System.out.println(map.get("사"));
		System.out.println(map.get("오"));//없는 키값 null
		
		if (map.containsKey("이")) {
			map.put("이", 22);
			//"이"의 키값이 있으면 집어 넣어라
		}		
		System.out.println(map.get("이"));
		//존재하는 키에 새로운 값을 넣으면  새 값을 참조한다		
	}
}
