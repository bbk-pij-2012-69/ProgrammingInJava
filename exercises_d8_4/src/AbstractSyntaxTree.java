
public class AbstractSyntaxTree {
	private String expression;
	private String sanitised_expr;
	AbstractSyntaxTree left;
	AbstractSyntaxTree right;
	
	public AbstractSyntaxTree(String expression)
	{
		
		//TODO - Split Expression.
		//TODO - How do we work out what the root is?
		this.expression = expression;
		this.sanitised_expr = expression.replace(" ", "");
		this.left = null;
		this.right = null;
//		for(int i = 0; i < expression.replace(" ", "").length(); ++i)
//		{
//			System.out.println(expression.replace(" ", "").charAt(i));
//
//		}
		
		for(Operator o : Operator.values()) {
			this.sanitised_expr.split(o.getCode());
		}
	}
	
	public static AbstractSyntaxTree parseExpression(String expression)
	{
		AbstractSyntaxTree tree = new AbstractSyntaxTree(expression);
		
		
		return tree;
	}
	
}
