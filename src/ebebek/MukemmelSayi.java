package ebebek;

import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,toplam = 0;
		
		System.out.print("Bir sayi giriniz: ");
		x= input.nextInt();
		
		for(int i=1; i<x; i++) {
			if(x%i==0) {
				toplam +=i;
			}
		}
		if(toplam == x) {
			System.out.println(x+" Mukemmel sayidir.");
			
		}
		else {
			System.out.println(x+" Mukemmel sayi degildir.");
		}
		
		
		

	}

}
