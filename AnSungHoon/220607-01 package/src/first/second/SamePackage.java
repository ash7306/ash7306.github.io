package first.second;


public class SamePackage {

	public static void main(String[] args) {
		AnotherClass a = new AnotherClass(); // 같은패키지 안은 됨
		a.number = 11;
//		a.mySecret = 22;
		a.test = 33;		
	}
}
