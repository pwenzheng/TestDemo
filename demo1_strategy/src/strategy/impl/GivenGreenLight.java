package strategy.impl;

import strategy.Interface.IStrategy;

public class GivenGreenLight implements IStrategy {

	@Override
	public void operate() {
		System.out.println("求吴国太开个绿灯,放行！");

	}

}
