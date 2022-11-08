package ebebek;

import java.util.Scanner;

public class ArtikYilHesapla {
	public static void main(String[] args) {
		
		int yil;

		Scanner input = new Scanner(System.in);

		System.out.println("Yýl Giriniz : ");
		yil = input.nextInt();

		// oncelikle 100'un kati olup olmadigini kontrol ediyoruz.
		double hesap1 = yil % 100;
		System.out.println(+hesap1);

		if (hesap1 == 0) {

			// 100'un kati ise 400'e tam bolunup bolunmedigine bakiyoruz.
			double hesap2 = yil % 400;

			if (hesap2 == 0) {

				System.out.println(yil + " artik yildir ! ");
			} else {

				System.out.println(yil + " artik yil degildir ! ");
			}

		} else {

			// 100'un kati degil ise 4'e tam bolunup bolunmedigine bakýyoruz.
			double hesap3 = yil % 4;

			if (hesap3 == 0) {

				System.out.println(yil + " artýk yildir ! ");
			} else {

				System.out.println(yil + "  artýk yil degildir ! ");
			}
		}
	}

}
