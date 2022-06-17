import java.util.Arrays;

public class StudentTest {
	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		
		students[0] = new Student("홍", 3.39);
		students[1] = new Student("임", 4.21);
		students[2] = new Student("황", 2.19);
		
		//오름차순 배열 매소드
		//Comparable 한 업캐스팅을 함
		Arrays.sort(students);
				
		for (Student s : students)
			System.out.println("이름=" + s.getName() + "평점=" + s.getGPA());
	}
}

class Student implements Comparable {
	private String name;
	private double gpa;
	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	public double getGPA() {
		return gpa;
	}
	
	@Override
	public int compareTo(Object obj) {
		Student other = (Student) obj;
		if (gpa < other.gpa)
			return -1;
		else if (gpa > other.gpa)
			return 1;
		else
			return 0;
	}	
}

