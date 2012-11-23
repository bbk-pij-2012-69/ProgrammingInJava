
public class run {

	public static void main(String[] args) {
		Spy[] spies = new Spy[15];
		
		for(int i = 0; i<spies.length;++i)
			spies[i] = new Spy(i*i);
		
		spies[0].die();
		spies[3].die();
		spies[7].die();
		spies[12].die();
	}

}
