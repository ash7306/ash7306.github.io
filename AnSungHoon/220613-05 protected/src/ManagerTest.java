
class Employee{
	public String name;
	String address;
	protected int salary;
	public int RRN;
	// private int RRN;
	// 부모인 직원 클래스에 
	
	// 자식에도 빈 파라미터 기본생성자를 만들면 부모에도 필요함!!
	public Employee() {
		
	}
	
	public String toString() {
		return name + ", " + address + ", " + RRN + ", " + salary;
		
	}

	public Employee(String name, String address, int salary, int rRN) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.RRN = RRN;
	}	
}

class Manager extends Employee {
	private int bonus;
	
	// 자식에도 빈 파라미터 기본생성자를 만들면 부모에도 필요함!!
	public Manager() {
		super();
	}
	
	public Manager(String name, String address, int salary, int RRN, int bonus) {
		super(name, address, salary, RRN);		
		this.bonus = bonus;
	}
	public void printSalary( ) {
		System.out.println(name + "( " + address + "):" + (salary + bonus));		
	}
	
	public void printRRN() {
		System.out.println(RRN);	
	}
		
//	public void printRRN() {
//		System.out.println(RRN);
//		// private는 서브 클래스에서 접근 못함
//	}
}

public class ManagerTest {
	public static void main(String[] args) {
		Manager m = new Manager("a", "b",5, 4,50);
		m.printRRN();
		m.printSalary();
	}
}
