package LAB;

public class Student extends Human{
	private String major;	
	
	public Student(String name, int age, String profession, String major) {
		super(name, age, profession);
		this.major = major;
	}
	
	@Override
	public String getProfession() {
		return "학생";
	}
	
	@Override
	public String toString() {
	//	return getName() + getAge() + "세" + "전공은" + major;
	//	return this.toString() + "전공은" + major;
	//	return name + age + "세" + "전공은" + major;
	//	부모 클래스의 필드를 proteted, public으로 바꿔주면됨 위처럼 가능
		return super.toString() + "전공은" + major;
		
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}
