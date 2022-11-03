package ebebek;

import java.util.Scanner;


public class manavKasaProgramý {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float armut;
		float elma;
		float domates;
		float muz;
		float patlican;
		double sonuc;
		
		/*
		    Armut : 2,14 TL
			Elma : 3,67 TL
			Domates : 1,11 TL
			Muz: 0,95 TL
			Patlýcan : 5,00 TL
		 */
		
		System.out.println("Hangi ürünlerden kaç kilogram aldýnýz ? ");
		
		System.out.print("kac kilogram armut aldiniz : ");
    	armut = input.nextFloat();
    	
    	System.out.print("kac kilogram elma aldiniz : ");
    	elma = input.nextFloat();
    	
    	System.out.print("kac kilogram domates aldiniz : ");
    	domates = input.nextFloat();
		
    	System.out.print("kac kilogram muz aldiniz : ");
    	muz = input.nextFloat();
    	
    	System.out.print("kac kilogram patlican aldiniz : ");
    	patlican = input.nextFloat();
		
		sonuc = 2.14*armut + 3.67*elma + 1.11*domates + 0.95*muz + 5*patlican;
		
		System.out.println("Toplam hesabýnýz : "+ sonuc);		

	}

}
