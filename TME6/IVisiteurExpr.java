package TME6;

public interface IVisiteurExpr<T> {
	T visite (Constant c);
	T visite (Var v);
	T visite (Add a);
	T visite (Minus m);

}
