package TME6;

public class Constant implements Expr {
	private Int val;

	public Constant(Int val) {
		this.val=val;
	}
	
	@Override
	public <T> T accepte(IVisiteurExpr<T> v) {
		// TODO Auto-generated method stub
		return v.visite(this);
	}
	
}
