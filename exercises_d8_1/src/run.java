public class run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		IntergerTree itn = test();
		test_max_min(itn);
		test_to_string();
		test_depth();
		test_deletion();
	}
	
	public static IntergerTree test(){
		// Initial test of add
		IntergerTree itn = new IntergerTree(3);
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
		
		return itn;
	}
	
	public static void test_max_min(IntergerTree itn)
	{
		// Test getMax/getMin
		System.out.println("Max: " + itn.getMax());
		System.out.println("Min: " + itn.getMin());
		itn = null;
	}

	public static void test_to_string(){
		// Test toString
		IntergerTree itn = new IntergerTree(6);
		System.out.println("toString:" + itn.toString());

		itn.add(9);
		System.out.println("toString: " + itn.toString());
		
		itn.add(5);
		itn.add(3);
		System.out.println("toString: " + itn.toString());

		itn.add(8);
		itn.add(11);
		itn.add(12);
		System.out.println("toString: " + itn.toString());
		itn = null;
	}		
	
	public static void test_depth(){
		// Test depth
		IntergerTree itn = new IntergerTree(6);
		System.out.println("depth: " + itn.depth());

		itn.add(9);
		System.out.println("depth: " + itn.depth());

		itn.add(5);
		itn.add(3);
		System.out.println("depth: " + itn.depth());
		
		itn.add(8);
		itn.add(11);
		itn.add(12);
		System.out.println("depth: " + itn.depth());
		itn = null;
	}
	
	public static void test_deletion(){
	
		// Test deletion
		IntergerTree itn = new IntergerTree(6);
		itn.add(9);
		itn.add(5);
		itn.add(3);
		System.out.println("toString: " + itn.toString());

		itn.remove(6);
		System.out.println("toString: " + itn.toString());
		itn = null;

		itn = new IntergerTree(6);
		itn.add(9);
		itn.add(5);
		itn.add(3);
		itn.add(8);
		itn.add(11);
		itn.add(12);
		System.out.println("toString: " + itn.toString());
		itn.remove(9);
		System.out.println("toString: " + itn.toString());
		itn.remove(3);
		System.out.println("toString: " + itn.toString());
		itn.remove(12);
		System.out.println("toString: " + itn.toString());
		itn.remove(6);
		System.out.println("toString: " + itn.toString());
		itn.remove(6);
		System.out.println("toString: " + itn.toString());
		
		
	}

}
