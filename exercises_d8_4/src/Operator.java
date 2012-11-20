public enum Operator
{
	PLUS("+"), MINUS("-"),DIVISOR("/"),MULTIPLY("*");
	
	private String symbol;
	 
	private Operator(String s)
	{
		 symbol = s ;
	}
	 
	public String getCode()
	{
		 return symbol;
	}
}

