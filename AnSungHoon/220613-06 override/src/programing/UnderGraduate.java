package programing;

public class UnderGraduate extends Student {
	protected String clupName;

	public UnderGraduate(String name, int stuNumbers, String department, int grade, int creditsCompleted,
			String clupName) {
		super(name, stuNumbers, department, grade, creditsCompleted);
		this.clupName = clupName;
	}

	public String getClupName() {
		return clupName;
	}

	public void setClupName(String clupName) {
		this.clupName = clupName;
	}
	
	@Override
	public String toString() {
		return name + "," + stuNumbers + "," + department + "," + grade + "," + creditsCompleted +
				"," + clupName;  
	}
}
