package a;

public class Member extends Person {
	
	 private int monthlyPayment;

	
	public Member(int id, String name, int age, int monthlyPayment, Adress adress) {
		super(id, name, age, adress);
		this.monthlyPayment = monthlyPayment;
	}

	public int getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(int monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	
	
	

}
