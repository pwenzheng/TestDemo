package strategy.context;

import strategy.Interface.Calculation;

public class Context2 {
	private Calculation calculation;
	
	public Context2(Calculation calculation) {
		this.calculation=calculation;
	}
	
	public double cal(double a,double b) {
		return this.calculation.calculation_res(a, b);
	}
}
