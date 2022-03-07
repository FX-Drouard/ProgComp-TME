package TME6;

public class Function implements Expr {
	private String name;
	private Var x;
	private Expr arg;
	private Type t;

	public Function(String name,Var x,Expr a,Type t) {
		this.name = name;
		this.x = x;
		arg = a;
		this.t = t;
	}

	@Override
	public <T> T accepte(IVisiteurExpr<T> v) {
		// TODO Auto-generated method stub
		return null;
	}

}
