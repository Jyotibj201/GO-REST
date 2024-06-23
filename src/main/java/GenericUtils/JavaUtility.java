package GenericUtils;

import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public String getRandomNum() {
		Random ran=new Random();
		int ranNum=ran.nextInt(1000);
		 return ""+ranNum;
		
	}
	
	
	public String getCurrentDate() {
		Date date=new Date();
		 String currentDate=date.toString().replace(' ', '_');
		 return currentDate;
	}
	
}
