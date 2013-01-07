
public class run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lecturer lect = new Lecturer("Sergio");
		Teacher teach = new Teacher("Paul");
		
		lect.doResearch("Some Topic");
		teach.teach("Java");

	}

}
