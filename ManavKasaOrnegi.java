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

		System.out.print("Kaç kilo armut alýndýðýný gir : ");

		armut = input.nextDouble();

		System.out.print("Kaç kilo elma alýndýðýný gir : ");

		elma = input.nextDouble();

		System.out.print("Kaç kilo domates alýndýðýný gir : ");

		domates = input.nextDouble();

		System.out.print("Kaç kilo muz alýndýðýný gir : ");

		muz = input.nextDouble();

		System.out.print("Kaç kilo patlican alýndýðýný gir : ");

		patlican = input.nextDouble();
		
		double total = (armutKgFiyati * armut) + (elmaKgFiyati * elma) 
				+ (domatesKgFiyati * domates) + (muzKgFiyati * muz) + (patlicanKgFiyati * patlican);
		
		System.out.println("Toplam Fiyat : " +total);

	}

}
