package strategy.impl;

import strategy.Interface.Calculation;

public class Addition implements Calculation {

	@Override
	public double calculation_res(double a, double b) {
		return a+b;
	}

}
