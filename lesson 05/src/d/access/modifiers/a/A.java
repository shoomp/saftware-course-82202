package d.access.modifiers.a;

public class A {

	private int nPrivate = 1; // most closed
	int ndefault = 3;
	protected int nProtected = 2;
	public int nPublic = 4; // most opened

	public void n() {

		A a = new A();

		System.out.println(a.nPrivate);
		System.out.println(a.nProtected);
		System.out.println(a.ndefault);
		System.out.println(a.nPublic);

	}

}
