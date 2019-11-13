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
		System.out.println("ִ�е�һ��������BackDoor()");
		context = new Context(new BackDoor());
		context.operate();
		
		System.out.println("ִ�еڶ���������GivenGreenLight()");
		context = new Context(new GivenGreenLight());
		context.operate();
		
		System.out.println("ִ�е���������");
		context = new Context(new BlockEnemy());
		context.operate();
		
		
		Context2 context2;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ӷ�");
		context2 = new Context2(new Addition());
		System.out.println(context2.cal(sc.nextFloat(), sc.nextFloat()));
		
		System.out.println("����");
		context2 = new Context2(new Subtraction());
		System.out.println(context2.cal(sc.nextFloat(), sc.nextFloat()));
		
		System.out.println("�˷�");
		context2 = new Context2(new Multiplication());
		System.out.println(context2.cal(sc.nextFloat(), sc.nextFloat()));
		
		System.out.println("����");
		context2 = new Context2(new Division());
		System.out.println(context2.cal(sc.nextFloat(), sc.nextFloat()));
		
		sc.close();
		
		
	}

}
