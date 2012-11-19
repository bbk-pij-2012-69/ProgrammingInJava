
public class run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListIntSet list = new ListIntSet(4);
		list.add(45);
		list.add(78);
		list.add(78);
		list.add(78);
		list.add(78);
		list.add(69);
		list.containsVerbose(1);
		

		TreeIntSet tree = new TreeIntSet(4);
		tree.add(45);
		tree.add(78);
		tree.add(72);
		tree.add(73);
		tree.add(74);
		tree.add(69);
		tree.containsVerbose(1);
		tree.containsVerbose(68);
	}

}
