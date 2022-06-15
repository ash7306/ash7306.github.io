package LAB;

public class Human {
	protected String name;
	protected int age;
	protected String profession;
	
	public Human (String name, int age , String profession) {
		this.profession = profession;
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + age + "세" + profession;
	}

	public String getProfession() {
		return profession;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}	
	
	public static void main(String[] args) {
				
	}
}
