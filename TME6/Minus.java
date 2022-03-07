package TME6;

public class Minus implements Expr {
	private Expr gauche,droit;
	
	public Minus(Expr g,Expr d) {
		gauche=g;
		droit=d;
	}
	
	@Override
	public <T> T accepte(IVisiteurExpr<T> v) {
		// TODO Auto-generated method stub
		return v.visite(this);
	}

}
