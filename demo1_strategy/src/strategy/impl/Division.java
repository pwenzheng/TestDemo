package strategy.impl;

import strategy.Interface.Calculation;

public class Division implements Calculation {

	@Override
	public double calculation_res(double a, double b) {
		if(b!=0) {
			a = a/b;
		}else {
			System.out.println("��������Ϊ0");
		}
		
		return a;
	}

}
