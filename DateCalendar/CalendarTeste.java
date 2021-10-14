package DateCalendar;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTeste {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		System.out.println("Hora atual: " + c.getTime());
		c.set(Calendar.YEAR, 1995);
		c.set(Calendar.DAY_OF_MONTH, 03);
		c.set(Calendar.MONTH, Calendar.NOVEMBER);
		
		System.out.println("Hora modificada: " + c.getTime());
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Dia: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mês: " + c.get(Calendar.MONTH));
		
		int ano = c.get(Calendar.YEAR);
		
		if(ano >= 1995) {
			System.out.println("Nasci a partir daqui!");
		}else 
			System.out.println("Ainda não tinha nascido... :(");
		
		c.set(2013, Calendar.APRIL, 15);
		Date data = c.getTime();
		
		System.out.println("Data sem formatação: " + data);
		
		//Formatação de data:
		DateFormat formataData = DateFormat.getTimeInstance();
		System.out.println("Data com atual formatação: " + formataData.format(data));
		
		//Formata Hora
		DateFormat hora = DateFormat.getTimeInstance();
				System.out.println("Hora formatada: "+hora.format(data));

				//Formata Data e Hora
				DateFormat dtHora = DateFormat.getDateTimeInstance();
				System.out.println(dtHora.format(data));
	}

}
