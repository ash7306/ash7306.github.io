import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main5 {
	public static void main(String[] args) {
		//중복되지 않는 1 ~ 45사이의 정수 6개를 가지는 집합
				
		Set<Integer> setLotto = new HashSet<>();
		Random random = new Random();
		
		while (setLotto.size() < 6)
			setLotto.add(random.nextInt(45)+1);
		
		
		System.out.println(setLotto);
		
		List<Integer> list = new ArrayList<>(setLotto);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}
