import java.util.StringTokenizer;

public class Main4 {
	public static void main(String[] args) {
		String friday = "금요일금요일금요일금요일금요일금요일금요일금요일금요일월요일월요일월요일월요일";
				
		StringTokenizer st = new StringTokenizer(friday, "금요일");
		
		String[] arr = friday.split("금요일");
		System.out.println(arr.length - 1);
	}
}
