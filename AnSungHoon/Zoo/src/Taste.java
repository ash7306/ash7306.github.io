public interface Taste {
	void taste();
}

//초식
interface Herbivore extends Taste {
	void taste();	
}

//육식
interface MeatEating extends Taste {
	void taste();
}

