
public class fourletters {
	int number;
	String question;
	String awnser;
	String hint;

	public fourletters(int number, String question, String awnser, String hint) {
		super();
		this.number = number;
		this.question = question;
		this.awnser = awnser;
		this.hint = hint;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAwnser() {
		return awnser;
	}

	public void setAwnser(String awnser) {
		this.awnser = awnser;
	}

	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	@Override
	public String toString() {
		return "fourletters [number=" + number + ", question=" + question + ", awnser=" + awnser + ", hint=" + hint
				+ "]";
	}

}
