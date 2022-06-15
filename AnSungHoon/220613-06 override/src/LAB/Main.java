package LAB;

public class Main {
	public static void main(String[] args) {
		Human h1 = new Human("춘향", 18, "미인");
		Human h2 = new Human("몽룡", 23, "암행어사");
		Human h3 = new Human("변사또", 40, "사또");
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		
		Student s1 = new Student("명진", 21, "컴퓨터", "학생" );
		Student s2 = new Student("미현", 22, "경영", "학생");
		Student s3 = new Student("용준", 24, "경제", "학생" );
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
				
	}
}
