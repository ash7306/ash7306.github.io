
public class Main3 {
	public static void main(String[] args) {
		try {
			System.out.println("--try 블록 안--");
			
			System.out.println("문장1");
			
			//인스턴스오프로 맞는 자료형인지 확인하지 않고 다운캐스팅을 함
			Object o = new Object();
			String s = (String) o;
			
			System.out.println("문장2");
			
			System.out.println("문장3");
		} catch (Exception e) {
			System.out.println("--catch 블록 안--");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			// try - catch 블록이 종료될 때에 반드시 실행된다.
			System.out.println("--finally 블록 안--");
		}
		System.out.println("정상 종료");
	}
}
