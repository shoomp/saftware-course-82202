package a;

import java.util.Arrays;

public class Classroom {

	private int id;
	private Type t;
	private Trainer tr = new Trainer(25);
	private Member[] members = new Member[10];

	public Classroom(int id, Type t, Trainer tr) {
		super();
		this.id = id;
		this.t = t;
		this.tr = tr;
	}

	public int getId() {
		return id;
	}

	public Type getT() {
		return t;
	}

	public Member[] getMembers() {
		return members;
	}

	public void setMembers(Member[] members) {
		this.members = members;
	}

	public Trainer getTr() {
		return tr;
	}

	public void setTr(Trainer tr) {
		this.tr = tr;
	}

	@Override

	public String toString() {
		return "Classroom [id = " + id + ", type =" + t + ", trainer = " + tr + ", members = "
				+ Arrays.toString(members) + "]";
	}

}
