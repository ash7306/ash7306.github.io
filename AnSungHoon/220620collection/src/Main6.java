import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 8, 9, 1));
		
		//정렬 Collections.sort 파라미터로 리스트 하나를 전달받음
		Collections.sort(list);//오름차순
		System.out.println(list);
		
		//2진검색으로 모든원소를 순환 하지 않고 8의 인덱스값을 찾고 싶음
		//조건은 중복x , 정렬이 되어 있고
		int index = Collections.binarySearch(list, 8);
		System.out.println("8의 인덱스: " + index);
		
		Collections.reverse(list);//내림차순
		System.out.println(list);
		
		Collections.shuffle(list);//섞어줌, 셔플
		System.out.println(list);
		
		System.out.println(Collections.max(list));//최대값
		System.out.println(Collections.min(list));//최소값
		
		Collections.fill(list, 33);//(해당리스트, 변경을원하는값)전체 원소값을 하나로
		System.out.println(list);
		
		Collections.replaceAll(list, 33, 77);//해당 원소값33을 찾아서 77로 바꿔줌
		System.out.println(list);
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90, 80, 70));
		
		Collections.copy(list, target);//list에 target을 앞에서부터 원소를 복사붙여넣기함
		//복사붙여넣기할 리스트의 길이가 기존의 리스트 길이보다 길어선 안됨
		System.out.println(list);
	}
}
