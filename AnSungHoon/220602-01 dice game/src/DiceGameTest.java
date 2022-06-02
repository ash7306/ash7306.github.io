import java.util.*;

class DiceGame {
	int diceFace;
	int userGuess;

	private void rollDice() {
		// Random random = new Random();
		// diceFace = random.nextInt(6) + 1;
		diceFace = (int) (Math.random() * 6) + 1;
	}

	// 접근 제한된 정수값을 반환 할 수 있는 getUserInput 이름의 메소드를 호출하기엔
	// String prompt(문자열 하나가) 필요함
	private int getUserInput(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

	private boolean checkUserGuess() {
		if (diceFace == userGuess) {
			System.out.println("맞았습니다.");
			return true;
		} else {
			System.out.println("틀렸습니다.");
			return false;
		}
	}

	public void startPlaying() {
		while (true) {
			userGuess = getUserInput("예상값을 입력하시오.");
			rollDice();			
			boolean result = checkUserGuess();
			if (result) {
				break;
			}
		}
	}
}

public class DiceGameTest {
	public static void main(String[] args) {
		// 생성자 호출 인스턴스화
		DiceGame game = new DiceGame();
		game.startPlaying();
	}
}
