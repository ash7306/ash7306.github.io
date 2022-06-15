
public class Member implements Comparable<Member> {
	String name;
	double height;
	double weight;
	double bmi;
	
	public Member(String name, double height, double weight) {	
		this.name = name;
		this.height = height;
		this.weight = weight;		
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void printMember() {
		System.out.println("회원이름: " + name +"\n키: " + height + "\n몸무게: " + weight);  
	}
	
	public void printBmi() {
		double bmi = weight / (height * height);
			System.out.println(name + " 회원님의 " + "BMI는: " + bmi);			
		if (bmi >= 35) {
			System.out.println("고도비만입니다");
		} else if (bmi < 35 ) {
			System.out.println("중도비만입니다");
		} else if (bmi < 30 ) {
			System.out.println("경도비만입니다");
		} else if (bmi < 25) {
			System.out.println("과체중입니다");
		} else if (bmi < 23) {
			System.out.println("정상체중입니다");
		} else {
			System.out.println("저체중입니다");
		}
		System.out.println("----------------");
	}

	@Override
	public int compareTo(Member members) {
		return (int) (this.height - members.height);
	}	
	
}
class Member2 extends Member implements Comparable<Member>{

	public Member2(String name, double height, double weight) {
		super(name, height, weight);		
	}
	
	
	public int compareTo(Member2 members) {
		return (int) (this.weight - members.weight);
	}	
}

