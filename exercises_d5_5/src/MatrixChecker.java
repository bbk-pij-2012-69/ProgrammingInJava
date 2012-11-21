
public class MatrixChecker {

	public boolean isSymmetrical(int[] array)
	{
		int begin = 0, end = array.length - 1;
		boolean match = true;
		
		while(begin <= end && match)
			match = array[begin++] == array[end--]; 

		return match;
	}
	
	public boolean isSymmetrical(int[][] array)
	{		
		int[] flattenedArray = new int[array.length * array[0].length];
		int position = 0;

		for(int i = 0; i < array.length; ++i)
			for(int j = 0; j < array[i].length; ++j)
				flattenedArray[position++] = array[i][j];
		
		return isSymmetrical(flattenedArray);
	}	
	
	public boolean isTriangular(int[][] array)
	{
		return this.isUpperTriangle(array) || this.isLowerTriangle(array);
	}
	
	private boolean isUpperTriangle(int[][] array)
	{
		boolean isUpperTriangular = true;
		for(int i = 0; i < array.length && isUpperTriangular; ++i)
			for(int j = 0; j < i && isUpperTriangular; ++j)
				if(array[i][j] != 0)
					isUpperTriangular = false;

		return isUpperTriangular;
	}
	
	private boolean isLowerTriangle(int[][] array)
	{
//		boolean isLowerTriangle = true;
//		for(int i = 0; i < array.length && isLowerTriangle; ++i)
//			for(int j = 0; j > i && isLowerTriangle; ++j)
//				if(array[i][j] != 0)
//					isLowerTriangle = false;
//
//		return isLowerTriangle;
		return false;
	}
}
