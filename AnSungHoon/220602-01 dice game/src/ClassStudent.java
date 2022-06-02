// 학생 관리 프로그램
// 콘솔 입출력
// 반에 학생을 등록. 3명
// 이름 목록을 볼 수 있어야 하고
// 평균을 볼 수 있고
// 1등 학생의 정보도 볼 수 있는 프로그램.

// 기존에 만들었던 클래스 << 수정. 수정을 해야하는 이유와 전 후가 어떻게 바뀌었는지 '기록'

import java.util.*;
class ClassStudent {
	Scanner scan = new Scanner(System.in);
	private String name;
	private int kor;
	private int eng;
	private int math;
	static ClassStudent student1 = new ClassStudent();
	static ClassStudent student2 = new ClassStudent();
	static ClassStudent student3 = new ClassStudent();
	static String name1 = student1.getNameInput();
	static String name2 = student2.getNameInput();
	static String name3 = student3.getNameInput();
	static int sum1;
	static int sum2;
	static int sum3;

//	public ClassStudent() {
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}
	
	public static String getNameInput() {
		System.out.println("이름을 입력하세요");
		Scanner n = new Scanner(System.in);
		return n.nextLine();
	}
	
	public static int getKor() {
		System.out.println("국어 점수를 입력하세요");
		Scanner k = new Scanner(System.in);
		return k.nextInt();
	}
	
	public static int getEng() {
		System.out.println("영어 점수를 입력하세요");
		Scanner e = new Scanner(System.in);
		return e.nextInt();
	}
	
	public static int getMath() {
		System.out.println("수학 점수를 입력하세요");
		Scanner m = new Scanner(System.in);
		return m.nextInt();
	}

	public static String getName1() {
		return name1;
	}
	public static String getName2() {
		return name2;
	}
	public static String getName3() {
		return name3; 
	}					
	
	public static int scoreAvg1() {
		System.out.print(name1 + "의");
		int st1kor = student1.getKor();
		int st1eng = student1.getEng();
		int st1math = student1.getMath();
		return sum1 = st1kor + st1eng + st1math;
	}
	public static int scoreAvg2() {
		System.out.print(name2 + "의");
		int st2kor = student2.getKor();
		int st2eng = student2.getEng();
		int st2math = student2.getMath();
		return sum2 = st2kor + st2eng + st2math;
	}
	public static int scoreAvg3() {
		System.out.print(name3 + "의");
		int st3kor = student3.getKor();
		int st3eng = student3.getEng();
		int st3math = student3.getMath();
		return sum3 = st3kor + st3eng + st3math;
	}
	
	public static void scoreAvg() {
		System.out.println("총평균은: " + (sum1/3 + sum2/3 + sum3/3) / 3);				
	}
		
	public static void nameListInput() {
		System.out.println("학생 목록");
		System.out.println(getName1());
		System.out.println(getName2());
		System.out.println(getName3());		
	}
		
	public static void bestStudent() {
		System.out.println("순위는");
		if (sum1 > sum2) {
			if (sum2 >= sum3) {
				System.out.printf("%s %s %s", name1 + sum1/3 + "점", name2 + sum2/3 + "점", name3 + sum3/3 + "점");
			} else {
				System.out.printf("%s %s %s", name1 + sum1/3 + "점", name3 + sum3/3 + "점", name2 + sum2/3 + "점");
			}		
		}
		
		else if (sum2 > sum1) {
			if (sum1 >= sum3) {
				System.out.printf("%s %s %s", name2 + sum2/3 + "점", name1 + sum1/3 + "점", name3 + sum3/3 + "점");
			} else {
				System.out.printf("%s %s %s", name2 + sum2/3 + "점", name3 + sum3/3 + "점", name1 + sum1/3 + "점");
			}		
		}
		
		else if (sum3 > sum1) {
			if (sum1 >= sum2) {
				System.out.printf("%s %s %s", name3 + sum3/3 + "점", name1 + sum1/3 + "점", name2 + sum2/3 + "점");
			} else {
				System.out.printf("%s %s %s", name3 + sum3/3 + "점", name2 + sum2/3 + "점", name1 + sum1/3 + "점");
			}		
		}
	}
}
