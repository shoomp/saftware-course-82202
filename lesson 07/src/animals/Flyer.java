package animals;

public interface Flyer {
	
	int MAW_ALT = 1000;
	
	void fly();
	
	 default void glide() {
		 System.out.println("so I'm gliding to the sky");
		 
	 }

}
