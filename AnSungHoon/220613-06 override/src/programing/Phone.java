package programing;

public class Phone {
	protected String mfCompany;
	protected int price;
	protected String communicationType;
	
	public Phone(String mfCompany, int price, String communicationType) {
		
		this.mfCompany = mfCompany;
		this.price = price;
		this.communicationType = communicationType;
	}

	public String getMfCompany() {
		return mfCompany;
	}

	public void setMfCompany(String mfCompany) {
		this.mfCompany = mfCompany;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCommunicationType() {
		return communicationType;
	}

	public void setCommunicationType(String communicationType) {
		this.communicationType = communicationType;
	}

	

}
