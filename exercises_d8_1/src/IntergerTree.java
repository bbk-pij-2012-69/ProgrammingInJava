
public class IntergerTree {
	private IntegerTreeNode root = null;
	
	public IntergerTree(int val)
	{
		this.root = new IntegerTreeNode(val);
	}
	
	public void add(int val)
	{
		this.root.add(val);
	}

	public String toString()
	{
		return root.toString();
	}
	
	public int getMax(){
		return root.getMax();
	}

	public int getMin(){
		return root.getMin();
	}

	public int depth(){
		return root.depth();
	}

	public void remove(int val){
		if(this.root == null) return;
		
		if(val == this.root.getValue())
		{
			IntegerTreeNode tmp = this.root.getRight();
			this.root = this.root.getLeft();
			this.root.add(tmp);
		}
		else root.remove(val);
	}

}
