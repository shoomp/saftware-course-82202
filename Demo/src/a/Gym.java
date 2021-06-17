package a;

public class Gym {

	private static Classroom[] classes = new Classroom[5];
	
	private Gym() {
		
	}
	
	private static Gym gym = new Gym();

	public static Classroom[] getClasses() {
		return classes;
	}

	public static void setClasses(Classroom[] classes) {
		classes = classes;
	}

	public static Gym getGym() {
		return gym;
	}
	
	
	
	

}
