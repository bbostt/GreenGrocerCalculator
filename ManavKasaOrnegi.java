import java.util.Scanner;

public class ManavKasaOrnegi {

	public static void main(String[] args) {
		double armutKgFiyati = 2.14;
		double elmaKgFiyati = 3.67;
		double domatesKgFiyati = 1.11;
		double muzKgFiyati = 0.95;
		double patlicanKgFiyati = 5.0;

		double armut, elma, domates, muz, patlican;

		Scanner input = new Scanner(System.in);

		System.out.print("Ka� kilo armut al�nd���n� gir : ");

		armut = input.nextDouble();

		System.out.print("Ka� kilo elma al�nd���n� gir : ");

		elma = input.nextDouble();

		System.out.print("Ka� kilo domates al�nd���n� gir : ");

		domates = input.nextDouble();

		System.out.print("Ka� kilo muz al�nd���n� gir : ");

		muz = input.nextDouble();

		System.out.print("Ka� kilo patlican al�nd���n� gir : ");

		patlican = input.nextDouble();
		
		double total = (armutKgFiyati * armut) + (elmaKgFiyati * elma) 
				+ (domatesKgFiyati * domates) + (muzKgFiyati * muz) + (patlicanKgFiyati * patlican);
		
		System.out.println("Toplam Fiyat : " +total);

	}

}
