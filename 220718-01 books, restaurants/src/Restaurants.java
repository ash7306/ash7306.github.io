
public class Restaurants {
	private int ResId;
	private String Name;
	private String Number;
	private String address;
	
	public Restaurants(int resId, String name, String number, String address) {
		super();
		ResId = resId;
		Name = name;
		Number = number;
		this.address = address;
	}
	
	public Restaurants(String name, String number, String address) {
		super();
		Name = name;
		Number = number;
		this.address = address;
	}
	
	public Restaurants(int resId) {
		super();
		ResId = resId;
	}

	public int getResId() {
		return ResId;
	}

	public void setResId(int resId) {
		ResId = resId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String title) {
		Name = title;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Restaurants [ResId=" + ResId + ", Name=" + Name + ", Number=" + Number + ", address=" + address + "]";
	}
}
