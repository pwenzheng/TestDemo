package strategy.context;

import strategy.Interface.IStrategy;

public class Context {
	/**
	 * 定义对象
	 */
	private IStrategy strategy;
	/**
	 * 构造函数
	 * @param strategy
	 */
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}
	/**
	 * 方法调用
	 */
	public void operate() {
		this.strategy.operate();
	}
	
}
