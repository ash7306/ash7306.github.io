import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1,2,3,4,5));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3,4,5,6,7));
		
		Set<Integer> setUnion = new HashSet<>();
		//합집합 setUnion
		//Set은 집합연산에 특화 되어 있다 (교집합, 합집합 등)
		setUnion.addAll(setA);
		setUnion.addAll(setB);
		System.out.println(setUnion);
		
		Set<Integer> setDuplicate = new HashSet<>();
		//교집합 setDuplicate
		//중복되어 있는 원소를 구함
		setDuplicate.addAll(setA);
		setDuplicate.retainAll(setB);//retain - 유지하다
		System.out.println(setDuplicate);
		
		Set<Integer> setLeftOuter = new HashSet<>();
		//차집합 setLeftOuter
		//중복값을 제외한 왼쪽값들을 구함
		setLeftOuter.addAll(setA);
		setLeftOuter.removeAll(setB);
		System.out.println(setLeftOuter);
		//왼쪽 차집합
		
		Set<Integer> setSame = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
		System.out.println(setSame.equals(setUnion));
		//리스트 값을 가지고 있냐고 이퀄스로 물어볼 수도 있다.

		
	}
}
