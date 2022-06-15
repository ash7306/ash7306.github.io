package programing;

public class Student {
	protected String name;
	protected int stuNumbers;
	protected String department;
	protected int grade;
	protected int creditsCompleted;

	public Student(String name, int stuNumbers, String department, int grade, int creditsCompleted) {
		this.name = name;
		this.stuNumbers = stuNumbers;
		this.department = department;
		this.grade = grade;
		this.creditsCompleted = creditsCompleted;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStuNumbers() {
		return stuNumbers;
	}

	public void setStuNumbers(int stuNumbers) {
		this.stuNumbers = stuNumbers;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getCreditsCompleted() {
		return creditsCompleted;
	}

	public void setCreditsCompleted(int creditsCompleted) {
		this.creditsCompleted = creditsCompleted;
	}
	
	public String toString() {
		return name + "," + stuNumbers + "," + department + "," + grade + "," + creditsCompleted;
	}

}
