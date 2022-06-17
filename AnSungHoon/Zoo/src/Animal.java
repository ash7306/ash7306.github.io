
public class Animal {
	String species;
	int age;
	int weight;
	public Animal() {
		
	}
	
	public Animal(String species, int age, int weight) {
		super();
		this.species = species;
		this.age = age;
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + ", age=" + age + ", weight=" + weight + "]";
	}	
	
	public void AnimalList() {
		
	}
}

class Horangee extends Animal implements MeatEating {	
	public Horangee(String species, int age, int weight) {
		super(species, age, weight);
	}

	@Override
	public void taste() {		
		System.out.println("육식");
	}	
}

class Geereen extends Animal implements Herbivore {

	public Geereen(String species, int age, int weight) {
		super(species, age, weight);
		
	}

	@Override
	public void taste() {		
		System.out.println("초식");
	}	
}

class Saja extends Animal implements MeatEating {
	public Saja(String species, int age, int weight) {
		super(species, age, weight);		
	}

	@Override
	public void taste() {		
		System.out.println("육식");
	}	
}

class Koggiree extends Animal implements Herbivore {
	public Koggiree(String species, int age, int weight) {
		super(species, age, weight);
		
	}

	@Override
	public void taste() {	
	 	System.out.println("초식");
	}
}




