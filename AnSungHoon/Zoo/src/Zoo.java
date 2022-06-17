
// 동물원 관리

// 동물  - 종, 나이, 무게

// 직원 - 이름, 역할(조련사, 경영 등등)
// 조련사는 동물을 1마리만 담당합니다.

// 동물은 육식/초식으로 나누어서 관리됩니다.
// 주식으로 분류하여 동물 목록을 볼 수 있음
// 조련사 담당에 따라 동물 목록을 볼 수 있음(담당이 없는 동물을

// 호랑이, 5, 100
// 기린, 3, 150
// 사자, 4, 120
// 코끼리, 7, 500

// a, 조련사
// b, 조련사
// c, 경영
import java.util.Arrays;
import java.util.Scanner;

public class Zoo {
	Scanner scan = new Scanner(System.in);
		
	// public static void zooMan(Animal[] animals, Employee[] employee) {
	// // 동물 목록
	//
	// }

	// 1. 동물목록
	public static void ZooList(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].toString());
			System.out.println("-----------");
		}
	}

	// 2. 육식, 초식 동물목록
	public static void TasteAnimal(Animal[] animals) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 육식동물" + " 2. 초식동물");
		int x = scan.nextInt();
		if (x == 1) {
			for (int i = 0; i < animals.length; i++) {
				if (animals[i] instanceof MeatEating) {
					System.out.println(animals[i].toString());
				}
			}
		} else if (x == 2) {
			for (int i = 0; i < animals.length; i++) {
				if (animals[i] instanceof Herbivore) {
					System.out.println(animals[i].toString());
				}
			}
		} else {
			System.out.println("재입력");
		}
	}

	// 3. 직원 목록
	public static void employeeList(Animal[] animals, Employee[] employee) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i].toString());
		}
	}

	// 4. 동물담당자
	public static void AnimalCharge(Animal[] animals, Employee[] employee) {
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
//		String t = animals[i].getSpecies();
//		String emp = employee[i].getAnimal();
//		String a = "육식"
		while(true) {
			System.out.println("1. 육식동물담당" + " 2. 초식동물담당" + " 3. 담당이 없는 동물" + " 4. 처음으로");
			int x = scan.nextInt();			
			if (x == 1) {
				for (i = 0; i < animals.length; i++) {
					if (animals[i].getSpecies().equals((employee[i].getAnimal()))) {
						if (animals[i] instanceof MeatEating) {
							System.out.println(employee[i].toString());
				
						}	
					}
				} break;
			} else if (x == 2) {
				for (i = 0; i < animals.length; i++) {
					if (animals[i].getSpecies().equals((employee[i].getAnimal()))) {
						if (animals[i] instanceof Herbivore) {
							System.out.println(employee[i].toString());
					
						}
					}
				} break; 
			} else if (x == 3) {
				for (i = 0; i < animals.length; i++) {
					if (!(animals[i].getSpecies().equals((employee[i].getAnimal())))) {
						System.out.println(employee[i].toString());
						
					}
				} break;
			} else if (x == 4) {
				break;
			} else {
				System.out.println("다시입력");
			}
		}
//		System.out.println("1. 육식동물담당" + " 2. 초식동물담당");
//		int x = scan.nextInt();
//		if (x == 1) {
//			for (int i = 0; i < employee.length; i++) {
//				if (employee[i] instanceof MeatEating) {
//					System.out.println(employee[i].toString());
//				}
//			}
//		} else if (x == 2) {
//			for (int i = 0; i < animals.length; i++) {
//				if (employee[i] instanceof Herbivore) {
//					System.out.println(employee[i].toString());
//				}
//			}
//		} else {
//			System.out.println("재입력");
//		}
	}

}
