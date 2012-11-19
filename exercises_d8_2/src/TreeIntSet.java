
public class TreeIntSet implements IntSet {
	private int value;
	private TreeIntSet left;
	private TreeIntSet right;
	
	public TreeIntSet(int val)
	{
		this.value = val;
		this.left = null;
		this.right = null;
	}
	
	@Override
	public void add(int val) {
		if(val > this.value){
			if (this.right == null){
				this.right = new TreeIntSet(val);
			}
			else{
				this.right.add(val);
			}
		}
		else{
			if (this.left == null){
				this.left = new TreeIntSet(val);
			}
			else{
				this.left.add(val);
			}
		}
	}

	@Override
	public boolean contains(int val) {
		return contains(val, false);
	}

	@Override
	public boolean containsVerbose(int val) {
		return contains(val, true);
	}
	
	private boolean contains(int val, boolean print) {
		if(print) System.out.println("Checking " + this.value);
		
		if(val < this.value)
		{
			if(this.left == null)
			{
				return false;
			}
			else
			{
				return this.left.contains(val, print);
			}
		}
		else if(val > this.value)
		{
			if(this.right == null)
			{
				return false;
			}
			else
			{
				return this.right.contains(val, print);
			}
		}
		else if(val == this.value)
		{
			return true;
		}
		
		return false;
	}
}
