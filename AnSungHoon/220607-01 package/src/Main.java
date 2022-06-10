import first.InPackageClass;
import first.second.AnotherClass;
// package
// 모든 패키지는 모두 소문자로
// 관련있는 폴더에 모아둔것
public class Main {
// 자바에선 클래스를 찾을땐 같은 패키지에서 먼저 찾음
	public static void main(String[] args) {
		InPackageClass test = new InPackageClass();
		
		AnotherClass test2 = new AnotherClass();
		test2.number = 10;
//		test2.mySecret = 22;
//		test.test = 33;		// 같은 패키지에서만 접근 가능

	}

}
