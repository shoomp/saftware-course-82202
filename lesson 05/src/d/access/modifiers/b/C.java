package d.access.modifiers.b;

import d.access.modifiers.a.A;

public class C {

	public void n() {

		A a = new A();

//		System.out.println(a.nPrivate);
//		System.out.println(a.ndefault);
//		System.out.println(a.nProtected);
		System.out.println(a.nPublic);

	}

}
