package a;

public class Adress {
	
	City city;
	String street;
	int number;
	
	public Adress(City city, String street, int number) {
		super();
		this.city = city;
		this.street = street;
		this.number = number;
	}
	
	public enum City{
		HAIFA, JRUSALEM, TEL_AVIV;
	}

}
