package note;

public class E2 {

	//���� ���� �� ����� ���� ���� ���� ����
	public static void main(String[] args) {

		int x = (int) (Math.random() * 100000001);
		System.out.println(x);

		while (x > 0) {
			System.out.print(x % 10);
			x = (int) (x / 10);
		}

	}

}
