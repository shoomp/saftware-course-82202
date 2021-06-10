package d.access.modifiers.b;

import d.access.modifiers.a.A;

public class D extends A {

	@Override
	public void n() {

//		System.out.println(this.nPrivate);
//		System.out.println(this.ndefault);
		System.out.println(this.nProtected);
		System.out.println(this.nPublic);

	}

}
