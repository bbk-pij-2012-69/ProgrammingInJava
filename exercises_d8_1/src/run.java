public class run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IntegerTreeNode itn = new IntegerTreeNode(3);

		itn.add(4);
		itn.add(14);
		itn.add(34);
		itn.add(44);
		itn.add(454);
		itn.add(24);
		itn.add(42);
		itn.add(44);
		itn.add(21);
		itn.add(54);
		itn.add(5);
		itn.add(214);
		itn.add(8);
		itn.add(6);
		itn.add(3);
		itn.add(45);
		itn.add(9);
		itn.add(123);
		itn.add(76);
		itn.add(213214);
		itn.add(10);
		itn.add(114);
		itn.add(11);
		itn.add(12);
		itn.add(144);
		itn.add(57);
		
		System.out.println("Max: " + itn.getMax());
		System.out.println("Min: " + itn.getMin());
		
	}

}
