package TME6;

import java.util.HashMap;
import java.util.Map;

public class Var implements Expr{
	private static Map<String,Expr> ENV = new HashMap<>();
	private Expr ex;
	private String s;

	public Var(String name,Expr ex) {
		this.ex=ex;
		s = name;
		ENV.put(s, ex);
	}
	
//	public void redefine(Expr ex) {
//		this.ex=ex;
//	}

	@Override
	public <T> T accepte(IVisiteurExpr<T> v) {
		// TODO Auto-generated method stub
		return v.visite(this);
	}

}
