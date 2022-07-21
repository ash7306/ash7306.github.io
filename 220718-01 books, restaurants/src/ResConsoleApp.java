import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ResConsoleApp {
	private RestaurantsRepo repo;
	
	public ResConsoleApp(RestaurantsRepo repo) {
		this.repo = repo;
	}
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("식당 프로그램");
		
		while (true) {
			System.out.println("1. 추가, 2. 목록, 3. 삭제, 4. 수정, 5. 검색(제목), 6. 종료");
			int num = scan.nextInt();

			switch (num) {
			case 1:
				add();
				break;
			case 2:
				list();
				break;
			case 3:
				delete();
				break;
			case 4:
				update();
				break;
			case 5:
				serch();
				break;
			case 6:
				return;
			}
		}
	}

	// 목록
	public void list() {
		try {
			List<Restaurants> list = repo.list();

			if (list.size() > 0) {
				for (Restaurants r : list) {
					System.out.println(r);
				}
			}
		} catch (SQLException e) {
			System.out.println("데이터 읽어오는 과정 실패");
		}
	}

	// 추가
	public void add() {
		list();
		Scanner scan = new Scanner(System.in);
		System.out.println("몇번추가?");
		int num = scan.nextInt();
		scan.nextLine();
		int result = 0;

		try {
			for (int i = 0; i < num; i++) {
				System.out.println("식당이름?");
				String name = scan.nextLine();
				System.out.println("식당전화번호?");
				String number = scan.nextLine();
				System.out.println("식당주소?");
				String address = scan.nextLine();
				
				result = repo.add(new Restaurants(name, number, address));
				List<Restaurants> list = repo.list();
				int count = 0;
				if (list.size() > 0) {
					for (Restaurants r : list) {
						count++;
					}
					System.out.println(count + "행에 식당이 추가 되었습니다.");
				}
			}
		} catch (SQLException e) {
			System.out.println("데이터 추가 실패");
		}
	}

	// 삭제
	public void delete() {
		list();
		System.out.println("삭제할 식당고유번호?");
		Scanner scan = new Scanner(System.in);
		int resId = scan.nextInt();

		try {
			List<Restaurants> list = repo.list();

			int count = 0;
			if (list.size() > 0) {
				for (Restaurants r : list) {
					count++;
					int result = repo.delete(resId);
					if (r.getResId() == resId) {
						System.out.println(count + "행의 식당이 삭제 되었습니다.");
					}
				}
			}
		} catch (SQLException e) {
			System.out.println("데이터 삭제 실패");
		}
	}

	// 수정
	private void update() {
		list();
		System.out.println("수정할 번호?");
		Scanner scan = new Scanner(System.in);
		int resId = scan.nextInt();
		scan.nextLine();

		System.out.println("식당이름?");
		String name = scan.nextLine();

		System.out.println("식당전화번호?");
		String number = scan.nextLine();

		System.out.println("식당주소?");
		String address = scan.nextLine();

		try {
			List<Restaurants> list = repo.list();

			int count = 0;
			if (list.size() > 0) {
				for (Restaurants r : list) {
					count++;
					repo.update(new Restaurants(name, number, address));
					if (r.getResId() == resId) {
						System.out.println(count + "행의 식당이 수정 되었습니다.");
					}
				}
			}
		} catch (SQLException e) {
			System.out.println("데이터 수정 실패");
		}
	}

	// 검색(식당번호로)
	public void serch() {
		Scanner scan = new Scanner(System.in);

		System.out.println("찾을 식당번호?");
		int resId = scan.nextInt();

		try {
			Restaurants restaurants = repo.selectById(resId);
			System.out.println(restaurants);
		} catch (SQLException e) {
			System.out.println("식당 찾기 실패");
		}
	}

	public static void main(String[] args) {
		ResConsoleApp app = new ResConsoleApp(new RestaurantsRepo());
		
		app.menu();
	}
}
