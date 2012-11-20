
public class Matrix {
	private int[][] array;
	private int width, height;
	
	public Matrix(int width, int height)
	{
		this.width = width;
		this.height = height;
		this.array = new int[this.width][this.height];
		
		for(int i = 0; i < this.array.length; ++i)
			for(int j = 0; j < this.array[i].length; ++j)
				this.setElement(i,j,1);
	}
	
	public void setElement(int x, int y, int value)
	{
		if(x < 0 || y < 0 || x > this.width || y > this.height)
			return;
		
		this.array[x][y] = value;
	}
	
	public void setRow(int y, String values)
	{
		String[] splitValues = values.split(",");
		if(splitValues.length <= 0 || splitValues.length > width)
			return;
		
		for(int i = 0; i < splitValues.length; ++i)
			this.setElement(i, y, new Integer(splitValues[i]));
	}
	
	
	public void setColumn(int x, String values)
	{
		String[] splitValues = values.split(",");
		if(splitValues.length <= 0 || splitValues.length > height)
			return;
		
		for(int i = 0; i < splitValues.length; ++i)
			this.setElement(x, i, new Integer(splitValues[i]));
	}
	
	public String toString()
	{
		String returnVal = "[";
		for(int i = 0; i < this.array.length; ++i)
		{
			if(i != 0) returnVal += ";"; 
			for(int j = 0; j < this.array[i].length; ++j)
			{
				if(j != 0) returnVal += ","; 
				returnVal += Integer.toString(this.array[j][i]);
			}
		}
		returnVal += "]";
		return returnVal;
	}
	
	public String prettyPrint()
	{
		String returnVal = "";
		for(int i = 0; i < this.array.length; ++i)
		{
			if(i != 0) returnVal += "\n"; 
			for(int j = 0; j < this.array[i].length; ++j)
			{
				if(j != 0) returnVal += "\t"; 
				returnVal += Integer.toString(this.array[j][i]);
			}
		}
		return returnVal;
	}
	
	public void setMatrix(String values)
	{
		String[] row_values = values.split(";");
		for(int i = 0; i < row_values.length; ++i)
			this.setRow(i, row_values[i]);
	}
}
