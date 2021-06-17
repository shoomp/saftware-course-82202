package animals;

public interface Swimmer {

	int MAX_SWIM = -1000;
	
	void swim();
	
	default void dive() {
		 System.out.println("so I can also dive into the sea");
		 
	 }
	
	
}
