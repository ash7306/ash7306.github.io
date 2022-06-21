import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// 일기 관리 프로그램
// 일기(날짜, 제목, 날씨, 내용 등등)

// 일기등록
// 일기 목록도 볼 수 있음
// 같은 일자에는 일기 중복X

// 일기 목록도 볼 수 있음.
// 날짜 순
// 내용 길이 순
// 날짜를 선택해서 해당 일기를 수정할 수 있어야함

// 삭제 - 가장 오래된 일기가 삭제됨.

public class Main {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>(Arrays.asList());
		List<Diary> list = new ArrayList<>();

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1번 일기 등록  2번 목록 3번 내용 수정 4번 삭제  5번 시스템 종료");
			int num = scan.nextInt();

			if (num == 1) {
				System.out.println("날짜, 제목, 날씨, 내용 입력");
				int date = scan.nextInt();
				scan.nextLine();
				String title = scan.nextLine();
				String weather = scan.nextLine();
				String contents = scan.nextLine();

				list.add(new Diary(date, title, weather, contents));
			} else if (num == 2) {
				System.out.println("1번 날짜순 2번 내용 길이 순");
				int x = scan.nextInt();

				if (x == 1) {
					Collections.sort(list);
					for (Diary s : list) {
						System.out.println(s);
					}
				} else if (x == 2) {
					Comparator<Diary> comparator = new Comparator<Diary>() {
						@Override
						public int compare(Diary o1, Diary o2) {
							return o1.contents.length() - o2.contents.length();
						}
					};
					Collections.sort(list, comparator);
					for (Diary s : list) {
						System.out.println(s);
					}
				}
			}

			else if (num == 3) {
				System.out.println(list);
				System.out.println("수정할 날짜를 입력");

				int day = scan.nextInt();
				int index = list.indexOf(new Diary(day));
			
				// System.out.println(list.get(index));
				System.out.println("수정할 내용을 입력");
				scan.nextLine();
				String contents = scan.nextLine();
				list.set(index, new Diary(contents));

			} else if (num == 4) {
				if (!list.isEmpty()) {
					list.remove(0);
				} else {
					System.out.println("리스트가 비어 있습니다.");
				}
				System.out.println(list);
			} else if (num == 5) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못입력");
			}
		}
	}
}
