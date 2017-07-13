package raj;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SplitString {
	public static void main(String[] args) throws ParseException {
		/*String str="1,13";
		String[] spl=str.split(",");
		System.out.println(spl.length);
		for (int i = 0; i < spl.length; i++) {
			System.out.println(spl[i]);
		}
		HashMap<String, String> hm = new HashMap<>();
		hm.put(spl[0], spl[1]);
		System.out.println(hm.get("1"));*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Calendar cal=Calendar.getInstance();
		Date appCreationDate=simpleDateFormat.parse("07-01-2011");
		Calendar startCalendar = new GregorianCalendar();
		startCalendar.setTime(appCreationDate);
		//Calendar endCalendar = new GregorianCalendar();
		//endCalendar.setTime(cal.getTime());
		
		int diffYear = cal.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
		int diffMonth = diffYear * 12 + cal.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
		
		Long diff = Math.abs(cal.getTimeInMillis()- appCreationDate.getTime());
		//long diffMonth =(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS))/30;
		System.out.println(diffMonth);
	 	
	}

}
