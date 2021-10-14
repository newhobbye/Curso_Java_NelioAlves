package DateCalendar;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatDataSaida {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL); //Data completa
		System.out.println("Data Brasileira: " + f.format(data));
		
		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Sem o dia descrito: " + f.format(data));
		
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("resumida 1: " + f.format(data));
		
		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("resumida 2: "+ f.format(data));
	}

}
