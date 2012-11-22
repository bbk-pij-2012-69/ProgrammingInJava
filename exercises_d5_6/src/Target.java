
public class Target {
	private int[][][] array;
	private int x; 
	private int y; 
	private int z; 
	
	public Target(int size)
	{
		this.init(size);
	}
	
	public Target(int size, boolean debug)
	{
		this.init(size);
		if (debug)
			System.out.println(" x: " + this.x + " y: " + this.y + " z:" + this.z);
	}
	private void init(int size)
	{
		this.array = new int[size][size][size];
		this.z = (int) Math.abs(array.length * Math.random());
		this.y = (int) Math.abs(array.length * Math.random());
		this.x = (int) Math.abs(array.length * Math.random());
		this.array[this.z][this.x][this.y] = 1;
		
	}
	
	public Result fire(int x, int y, int z)
	{
		if(x < 0 || y < 0 || z < 0 || z >= this.array.length || y >= this.array[0].length || x >= this.array[0][0].length)
			return Result.OUT_OF_RANGE;
		
		if(x > this.x)
			return Result.FAIL_LEFT;
		if(x < this.x)
			return Result.FAIL_RIGHT;

		if(y > this.y)
			return Result.FAIL_LOW;
		if(y < this.y)
			return Result.FAIL_HIGH;

		if(z > this.z)
			return Result.FAIL_SHORT;
		if(z < this.z)
			return Result.FAIL_LONG;

		return Result.HIT;
	}

}
