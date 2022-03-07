package TME6;

public class Add implements Expr {
	private Expr gauche,droit;
	
	public Add(Expr g,Expr d) {
		gauche = g;
		droit = d;
	}
	
	@Override
	public <T> T accepte(IVisiteurExpr<T> v) {
		// TODO Auto-generated method stub
		return v.visite(this);
	}

}
