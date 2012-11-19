
public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;

	public IntegerTreeNode(int val)
	{
		this.value = val;
		this.left = null;
		this.right = null;
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public IntegerTreeNode getRight()
	{
		return this.right;
	}
	
	public IntegerTreeNode getLeft()
	{
		return this.left;
	}
	
	public void add(int newNumber){
		if(newNumber > this.value){
			if (this.right == null){
				this.right = new IntegerTreeNode(newNumber);
			}
			else{
				this.right.add(newNumber);
			}
		}
		else{
			if (this.left == null){
				this.left = new IntegerTreeNode(newNumber);
			}
			else{
				this.left.add(newNumber);
			}
		}
	}
	
	public void add(IntegerTreeNode newNode){
		if (newNode == null){
			return;
		}
		if(newNode.getValue() > this.value){
			if (this.right == null){
				this.right = newNode;
			}
			else{
				this.right.add(newNode);
			}
		}
		else{
			if (this.left == null){
				this.left = newNode;
			}
			else{
				this.left.add(newNode);
			}
		}
	}
	
	public boolean contains(int n){
		if (n == this.value){
			return true;
		}
		else if (n > this.value){
			if(this.right == null){
				return false;
			}
			else{
				return this.right.contains(n);
			}
		}
		else{
			if(this.left == null){
				return false;
			}
			else{
				return this.left.contains(n); 
			}
		}
	}

	public int getMax(){
		if (this.right == null){
			return this.value;
		}
		else{
			return this.right.getMax();
		}
	}

	public int getMin(){
		if (this.left == null){
			return this.value;
		}
		else{
			return this.left.getMin();
		}
	}

	public String toString(){
		return this.toString(false);
	}
	
	private String toString(boolean child){
		String val = String.valueOf(this.value) + " L[" + ((this.left == null) ? "" : this.left.toString(true)) + "] R[" + ((this.right == null) ? "" : this.right.toString(true)) + "]";
		
		if(child){ 
			return val;
		}
		else{
			return "[" + val + "]";
		}
	}

	public int depth()
	{
		int left_depth = depth(this.left);
		int right_depth = depth(this.right);
		return (left_depth >= right_depth) ? left_depth : right_depth;
	}
	
	private int depth(IntegerTreeNode node)
	{
		if(node == null)
		{
			return 0;
		}
			
		int left_depth = depth(node.left);
		int right_depth = depth(node.right);
		return (left_depth >= right_depth) ? left_depth + 1 : right_depth + 1;
	}
	
	public void remove(int val){
		if(val < this.value && this.left != null)
		{
			this.left.remove(val, this);
		}
		else if(val > this.value && this.right != null)
		{
			this.right.remove(val, this);
		}
	}
	
	private void remove(int val, IntegerTreeNode parent)
	{

		if(val < this.value && this.left != null)
		{
			left.remove(val, this);
		}
		else if(val > this.value && this.right != null)
		{
			right.remove(val, this);
		}
		else if(val == this.value)
		{
			if(this.left != null && this.right != null)
			{
				this.value = this.right.minValue();
				this.right.remove(this.value, this);
			}
			else if(parent.left == this)
			{
				parent.left = ((this.left == null) ? this.right :this.left); 
			}
			else if(parent.right == this)
			{
				parent.right = ((this.left == null) ? this.right :this.left);
			}
		}
	}
	
    private int minValue() {
        if (this.left == null)
              return this.value;
        else
              return this.left.minValue();
    }
	
	
}
