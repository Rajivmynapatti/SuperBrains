package onboarding;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class systemdateandtime {

	public static void main(String[] args) {
		
		
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			
			Date date = new Date();
			
			String systemdateandtime= dateFormat.format(date);
			
			System.out.println("Current date and time: --- "+systemdateandtime);
	}

}
