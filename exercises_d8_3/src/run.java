
public class run {

	/**
	 * @param args	
	 */
	public static void main(String[] args) {
		testTree();
		testList();
	}
	
	public static void testTree()
	{
		
		TreeIntSortedList list = new TreeIntSortedList(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(20);
		list.add(12);
		list.add(14);
		list.add(11);
		list.add(13);
		System.out.println(list.toString());
		
		checkContains(list, 10);
		checkContains(list, 12);
		checkContains(list, 1);
		checkContains(list, 40);
		checkContains(list, 13);
		checkContains(list, 15);
	}
	
	
	public static void testList()
	{
		
		ListIntSortedList list = new ListIntSortedList(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(20);
		list.add(12);
		list.add(14);
		list.add(11);
		list.add(13);
		System.out.println(list.toString());
		
		checkContains(list, 10);
		checkContains(list, 12);
		checkContains(list, 1);
		checkContains(list, 40);
		checkContains(list, 13);
		checkContains(list, 15);
	}
	
	public static void checkContains(IntSortedList list, int val)
	{
		boolean contains = list.contains(val);
		String msg = (contains) ? "Contains " + val : "Missing " + val;
		System.out.println(msg);
		
	}

}
