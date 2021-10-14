package DateCalendar;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleDate {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		
		Locale brasil = new Locale("pt", "BR"); // Lingua e País.
		Locale eua = Locale.US;
		Locale italia = Locale.ITALIAN;
		
		DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		System.out.println("BR: " + f2.format(data));
		
		DateFormat f3 = DateFormat.getDateInstance(DateFormat.FULL, eua);
		System.out.println("Eua: " + f3.format(data));
		
		DateFormat f4 = DateFormat.getDateInstance(DateFormat.FULL, italia);
		System.out.println("Italia: " + f4.format(data));
		
		//https://www.devmedia.com.br/manipulando-datas-em-java/21765
		
		
	}

}
