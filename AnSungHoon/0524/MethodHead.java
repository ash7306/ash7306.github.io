public class MethodHead {
	// 정수 두 개를 전달받아 왼쪽이 큰지, 오른쪽이 큰지 혹은 같은지를 알고 싶음.
	public static int compare(int left, int right) {
		if (left > right) {
			return -1;
		} else if (left < right) {
			return 1;
		} else {
			return 0;
		}		
	}
	
	public static void main(String[] args) {
	
	int x = compare(14,15);
	System.out.println(x);
	// -1 left, 1 right, 0 same
	}
}