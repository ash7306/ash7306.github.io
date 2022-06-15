package programing;

public class Graduate extends Student {
	protected String assistantType;
	protected double scholarshipRate;
//	

	public Graduate(String name, int stuNumbers, String department, int grade, int creditsCompleted,
			String assistantType, double scholarshipRate) {
		super(name, stuNumbers, department, grade, creditsCompleted);
		this.assistantType = assistantType;
		this.scholarshipRate = scholarshipRate;
	}

	public String getAssistantType() {
		 		
		return assistantType;
	}
// 조교유형	
	public void setAssistantType(String assistantType) {
		if (assistantType == "교육" ) {
			assistantType = "교육조교";
		} else {
			assistantType = "연구조교";
		}
//		teaching assistant 교육조교
//		research assistant 연구조교
		
	}

	public double getScholarshipRate() {
		
		
		return scholarshipRate;
	}

	public void setScholarshipRate(double scholarshipRate) {
		this.scholarshipRate = scholarshipRate;
	}
	
	@Override
	public String toString() {
		return name + "," + stuNumbers + "," + department + "," + grade + "," + creditsCompleted +
				"," + assistantType + "," + scholarshipRate;  
	}
	
	public static void main(String[] args) {
		Student stu = new Student("훈", 114567, "회계", 4, 20 );
		System.out.println(stu.toString());
		UnderGraduate und = new UnderGraduate("훈", 114567, "회계", 4, 20 , "마이더스"); 
		System.out.println(und.toString());
		Graduate gr = new Graduate ("훈", 114567, "회계", 4, 20 , "교육", 0.4);
		System.out.println(gr.toString());
	}
	
	
}


