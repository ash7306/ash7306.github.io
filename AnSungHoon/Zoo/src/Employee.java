
public class Employee {
	String name;
	String role;
	String animal;
	public Employee(String name, String role) {		
		this.name = name;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", role=" + role + "]";
	}
}

class Trainer extends Employee implements MeatEating{
	String animal;
	public Trainer(String name, String role, String animal) {
		super(name, role);
		this.animal = animal;
	}
	
	
	public String getAnimal() {
		return animal;
	}


	public void setAnimal(String animal) {
		this.animal = animal;
	}


	@Override
	public void taste() {		
		
	}	
}

class Manager extends Employee implements Herbivore {
	
	String animal;
	public Manager(String name, String role, String animal) {
		super(name, role);
		this.animal = animal;
	}
	
	
	public String getAnimal() {
		return animal;
	}


	public void setAnimal(String animal) {
		this.animal = animal;
	}

	@Override
	public void taste() {		
		
	}	
}


