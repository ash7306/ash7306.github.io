import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 학생
//이름
//나이
//(학생은 이름과 나이가 같으면 동일 학생입니다)

//홍길동 15
//둘리 22
//도우너 33

//위의 학생을 원소로 가지는 리스트를 생성하고
//(도우너33) 학생의 인덱스를 찾아보세요
class Student implements Comparable<Student> {
	// Comparable 추상메소드를 오버라이드 해줘여함
	private String name;
	private int age;
	private int score;

	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public int getScore() {
		return score;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
		// 점수는 상관없이 이름과 나이가 같으면 같은 학생으로 재정의 해둠!!
	}

	@Override
	public int compareTo(Student o) {
		return score - o.score;
	}

}

public class Main2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		// 제네릭은 스튜던트 타입으로 , 구현체는 어레이 리스트로

		list.add(new Student("홍길동", 15, 90));
		list.add(new Student("둘리", 22, 80));
		list.add(new Student("도우너", 33, 95));

		System.out.println(list);

		System.out.println("인덱스값: " + list.indexOf(new Student("도우너", 33, 0)));
		// 점수는 상관없이 이름과 나이가 같으면 같은 학생으로 재정의 해둠!!
		// System.out.println(list.indexOf(0)); //-1 서치가 안된다는 뜻

		// 정렬???
		Collections.sort(list);
		// 그냥 정렬하면 컴파일 에러 발생 와이?
		// 가지고 있는게 학생인데 학생으로만 대소를 비교할 수 있는 기준이 없다.
		// 그래서 학생 클래스의 임플리먼츠 Comparable 로 구현해주고
		// 추상메소드를 구현하기 위해 Comparable 추상메소드를 오버라이드 해줘여함

		System.out.println(list);
		
		//익명클래스 임
		Comparator<Student> comparator = new Comparator<Student>() {			
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() - o2.getAge();
			}
		};//그래서 끝에 ; 씀
		
		Collections.sort(list, comparator);
		System.out.println(list);
	}
}
