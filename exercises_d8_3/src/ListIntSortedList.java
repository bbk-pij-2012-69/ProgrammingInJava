
public class ListIntSortedList implements IntSortedList {
	private int value;
	private ListIntSortedList nextItem;
	
	public ListIntSortedList(int val)
	{
		this.value = val;
	}
	
	private void insertAfter(ListIntSortedList node)
	{
		node.nextItem = this.nextItem;
		this.nextItem = node;
	}
	
	@Override
	public void add(int val) {
		if(this.nextItem != null && (this.value == val || val < this.nextItem.value))
		{
			this.insertAfter(new ListIntSortedList(val));
		}
		else if(this.nextItem == null) this.nextItem = new ListIntSortedList(val);
		else this.nextItem.add(val);

	}

	@Override
	public boolean contains(int val) {
		if(this.value == val) return true;
		else if(this.nextItem != null) return this.nextItem.contains(val);
		else return false;
	}

	@Override
	public String toString() {
		String listString = "";
		if(this.nextItem == null) return String.valueOf(this.value);
		else listString = this.nextItem.toString();
		listString  = String.valueOf(this.value) + ", " + listString;
		return listString ;
	}

}
