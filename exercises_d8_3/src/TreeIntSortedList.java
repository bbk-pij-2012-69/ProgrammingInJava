
public class TreeIntSortedList implements IntSortedList {
	private int value;
	private TreeIntSortedList left;
	private TreeIntSortedList right;
	
	public TreeIntSortedList(int val)
	{
		this.value = val;
		this.left = null;
		this.right = null;
	}
	
	
	@Override
	public void add(int val) {
		if(val > this.value){
			if (this.right == null){
				this.right = new TreeIntSortedList(val);
			}
			else{
				this.right.add(val);
			}
		}
		else{
			if (this.left == null){
				this.left = new TreeIntSortedList(val);
			}
			else{
				this.left.add(val);
			}
		}
	}

	@Override
	public boolean contains(int val) {
		if(val < this.value)
		{
			if(this.left == null) return false;
			else return this.left.contains(val);
		}
		else if(val > this.value)
		{
			if(this.right == null) return false;
			else return this.right.contains(val);
		}
		else if(val == this.value) return true;
		
		return false;
	}
	
	public int getValue(){
		return this.value;
	}
	
	@Override
	public String toString() {
		String listString = "";
		if(this.left == null && this.right == null) return String.valueOf(this.value);
		else if(this.left == null)
		{
			listString = String.valueOf(this.value) + ", " + this.right.toString();
			return listString;
		}
		else if(this.right == null)
		{
			listString = this.left.toString() + ", " +  String.valueOf(this.value);
			return listString;
		}
		
		return this.left.toString() + ", " + this.value + ", " + this.right.toString(); // + ", " + this.right.toString();
	}
	

}
