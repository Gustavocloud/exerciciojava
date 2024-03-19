package exercicio_1;
import java.util.Locale;
import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
	    
		String product1 = "Computer";
		String product2 = "OfficeDesk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
	    
		double price1 = 2100.50;
		double price2 = 650.50;
		double measure = 53.234567;
	
		System.out.println(String.format("%s, which price is $ %.2f", product1, price1));
		System.out.println(String.format("%s, which price is $ %.2f", product2, price2));
		System.out.println(String.format("Record:%d years old, %d and gender:", age, code, 'F'));
		System.out.println(String.format("measue with eight decimal places: %.8f", measure));
		System.out.println(String.format("Rouded(three decimal places):%.3f", measure));
		Locale.setDefault(Locale.ENGLISH);
		System.out.println(String.format("US decimal point: %.3f", measure));
		
	}

}
