package lekcja2;

public class Kot {

	@Override
	public String toString() {
		return "Kot [name=" + name + ", opiekun=" + opiekun + ", date=" + date + ", waga=" + waga + "]";
	}

	////////////////////////////////////////////// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOpiekun() {
		return opiekun;
	}

	public void setOpiekun(String opiekun) {
		this.opiekun = opiekun;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Float getWaga() {
		return waga;
	}

	public void setWaga(float waga) {
		this.waga = (float)waga;
	}

	///////////////////////////////////////////////// variables
	private String name, opiekun;
	private String date;
	private Float waga;
	

}
