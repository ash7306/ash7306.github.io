
public class Diary implements Comparable<Diary> {
	int date;
	String title;
	String weather;
	String contents;

	public Diary(String contents) {
		this.contents = contents;
	}
	
	public Diary(int date) {
		this.date = date;
	}

	public Diary(int date, String title, String weather, String contents) {
		super();
		this.date = date;
		this.title = title;
		this.weather = weather;
		this.contents = contents;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		contents = contents;
	}

	@Override
	public String toString() {
		return "Diary [date=" + date + ", title=" + title + ", weather=" + weather + ", contents=" + contents + "]";
	}

	@Override
	public int compareTo(Diary o) {
		return date - o.date;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diary other = (Diary) obj;
		if (date != other.date)
			return false;
		return true;
	}

}
