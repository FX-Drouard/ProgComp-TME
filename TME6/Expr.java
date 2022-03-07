package TME6;

public interface Expr {
	
	public <T> T accepte(IVisiteurExpr<T> v);
}
