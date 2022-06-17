import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Zoo zoo = new Zoo();

//		Animal[] animals = new Animal[4]; 
//		Animal a1 = new Horangee("호랑이", 5, 100);
//		Animal a2 = new Geereen("기린", 3, 150);
//		Animal a3 = new Saja("사자", 4, 120);
//		Animal a4 = new Koggiree("코끼리", 4, 500);	
//		
		Animal[] animals = new Animal[4]; 
		Animal a1 = new Horangee("호랑이", 5, 100);
		Animal a2 = new Geereen("기린", 3, 150);
		Animal a3 = new Saja("사자", 4, 120);
		Animal a4 = new Koggiree("코끼리", 4, 500);
		Employee[] employees = new Employee[4];
		employees[0] = new Trainer("안", "조련사", "호랑이");
		employees[1] = new Trainer("성", "조련사", "기린");
		employees[2] = new Manager("훈", "경영", "없음");
		employees[3] = new Manager("김", "경영", "없음");
				
		animals[0] = a1;
		animals[1] = a2;
		animals[2] = a3;
		animals[3] = a4;
		
//		zoo.zooMan(animals, employees);
				
		while(true) {
			System.out.println("1. 동물목록\t" + " 2. 주식에따른동물목록\t" + " 3. 직원목록\t" + " 4. 동물담당\t" + "5. 종료");	
			int x = scan.nextInt();
				
			switch (x) {
			case 1:			
				zoo.ZooList(animals);
				break;
			case 2:
				zoo.TasteAnimal(animals);
				break;
			case 3:
				zoo.employeeList(animals, employees);
				break;
			case 4:
				zoo.AnimalCharge(animals, employees);
				break;
			case 5:
				System.out.println("프로그램종료");
				return;
			default :
				System.out.println("다시입력해주세요.");
				break;
			}
		} 
	}
}
