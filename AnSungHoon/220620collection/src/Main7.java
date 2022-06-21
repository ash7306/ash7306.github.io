import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main7 {
	public static void main(String[] args) {
		//2의 배수를 5개 가지는 정수형 리스트 생성 및 초기화해보기
		
		//7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화해보기
		
		//위 리스트의 원소들을 모두 다 가지는 리스트
		
		//위 리스트를 오름차순으로 정렬된 원소를 가지는 새 리스트 인스턴스 생성
		
		List<Integer> list = new ArrayList<>();
		
		//2의 배수 5개 리스트
		for (int i = 0; i < 5; i++) {
			list.add(i, (i + 1) * 2);
		}		
		System.out.println(list);
		
		//7의 배수 5개 리스트
		List<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list2.add(i, (i + 1) * 7);
		}
		System.out.println(list2);
		
		//위 두개의 리스트를 합친 리스트
		List<Integer> listAll = new ArrayList<>();
		listAll.addAll(list);
		listAll.addAll(list2);
		System.out.println(listAll);
		
		//그 리스트를 오름차순으로 정렬
		List<Integer> ordered = new ArrayList<>(listAll);
		Collections.sort(ordered);
		System.out.println(ordered);
		
		//0~10사이의 난수 6개 가지는 리스트 (각 숫자값은 중복 x)
		List<Integer> randomList = new ArrayList<>();
		for (int i = 0; i < 11; i++) {
			randomList.add(i, i);			
		}		
		Collections.shuffle(randomList);
		System.out.println(randomList.subList(0, 6));

		//랜덤클래스를 사용
		List<Integer> randomList2 = new ArrayList<>();
		Random random = new Random();
		int x = randomList2.size();
		
		while (x < 6) {
			int a = random.nextInt(11);			
			if(!randomList2.contains(a)) {
				randomList2.add(a);				
			}
		}
		System.out.println(randomList2);
	}	
	
}
