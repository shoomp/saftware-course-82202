package A;

public class StringM {
	public static void main(String[] args) {
		{

			String str1 = "Atention please, ";
			System.out.println(str1);

			String str2 = "This is anonother string object.";
			String str3 =  "this is a string. \n" + str2;

			System.out.println(str3);

			int a = 4;
			int b = 5;
			System.out.println(a + " + " + b + " = " + (a + b));
			System.out.println(a + " " + b + " " + (a + b));

		}
		{
			String x = "moriya";
			String y = "Refael";
			String xy = " is the mother of ";
			String z = x + xy + y;

			System.out.println(z);
		}
		{
			int a = (int) (Math.random()*11);
			int b = (int) (Math.random()*11);
			int c = a * b;
			
			System.out.println(a + " * " +  b + " = " + c );
			System.out.println(a < b);
		}
		{
			int a = 10, b = 20;
			int r = (int)(Math.random()*(b-a+1))+a;
		
			System.out.println((Math.random()*20)>(b-5));
			System.out.println(r);
			
		}
		
	}

}
