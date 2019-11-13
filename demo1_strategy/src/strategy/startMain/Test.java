package strategy.startMain;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test {

	public static void main(String[] args) throws Exception {
		 Calendar cal = Calendar.getInstance();
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		 cal.setTime(format.parse("2019-06-20"));  
		 int week_index = cal.get(Calendar.DAY_OF_WEEK) - 1;
		 if(week_index==4 || week_index==3){
			 System.out.println("aaaa");
		 }
		 
		 test();
		// Test t = new Test();
		// t.test();
		 System.out.println(Calendar.DAY_OF_WEEK+"=="+week_index);
		 
		 
		
	}
	
	public static void test(){
		 System.out.println("aaa");
		 
	 }

}
