package strategy.startMain;

import java.util.Scanner;

import strategy.context.Context;
import strategy.context.Context2;
import strategy.impl.Addition;
import strategy.impl.BackDoor;
import strategy.impl.BlockEnemy;
import strategy.impl.Division;
import strategy.impl.GivenGreenLight;
import strategy.impl.Multiplication;
import strategy.impl.Subtraction;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context;
		System.out.println("执行第一个方法，BackDoor()");
		context = new Context(new BackDoor());
		context.operate();
		
		System.out.println("执行第二个方法，GivenGreenLight()");
		context = new Context(new GivenGreenLight());
		context.operate();
		
		System.out.println("执行第三个方法");
		context = new Context(new BlockEnemy());
		context.operate();
		
		
		Context2 context2;
		Scanner sc = new Scanner(System.in);
		System.out.println("加法");
		context2 = new Context2(new Addition());
		System.out.println(context2.cal(sc.nextFloat(), sc.nextFloat()));
		
		System.out.println("减法");
		context2 = new Context2(new Subtraction());
		System.out.println(context2.cal(sc.nextFloat(), sc.nextFloat()));
		
		System.out.println("乘法");
		context2 = new Context2(new Multiplication());
		System.out.println(context2.cal(sc.nextFloat(), sc.nextFloat()));
		
		System.out.println("除法");
		context2 = new Context2(new Division());
		System.out.println(context2.cal(sc.nextFloat(), sc.nextFloat()));
		
		sc.close();
		
		
	}

}
