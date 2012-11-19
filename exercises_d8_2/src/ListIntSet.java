
public class ListIntSet implements IntSet {
	private ListIntSet nextItem = null;
	private int value;
	
	public ListIntSet(int val)
	{
		this.value = val;
	}
	
	@Override
	public void add(int val) {
		if(this.value == val) return;
		else if(this.nextItem == null) this.nextItem = new ListIntSet(val);
		else this.nextItem.add(val);
	}

	@Override
	public boolean contains(int val) {
		return this.contains(val, false);
	}

	@Override
	public boolean containsVerbose(int val) {
		return this.contains(val, true);
	}

	private boolean contains(int val, boolean print) {
		if(print) System.out.println("Checking " + this.value);
		if(this.value == val) return true;
		else if(this.nextItem != null) return this.nextItem.contains(val, print);
		else return false;
	}
}
