package strategy.context;

import strategy.Interface.IStrategy;

public class Context {
	/**
	 * �������
	 */
	private IStrategy strategy;
	/**
	 * ���캯��
	 * @param strategy
	 */
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}
	/**
	 * ��������
	 */
	public void operate() {
		this.strategy.operate();
	}
	
}
