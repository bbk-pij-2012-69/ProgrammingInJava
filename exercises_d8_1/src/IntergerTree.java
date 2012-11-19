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
			IntegerTreeNode tmp = new IntegerTreeNode(0);
			tmp.setLeft(this.root);
			this.root.remove(val, tmp);
			this.root = tmp.getLeft();
		}
		else this.root.remove(val, null);
	}
	
	public void rebalance(){
		this.root.rebalance();
	}

}
