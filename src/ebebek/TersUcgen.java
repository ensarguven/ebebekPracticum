package ebebek;

import java.util.Scanner;

public class TersUcgen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		System.out.print("Basamak sayýsýný girin: ");
		x=input.nextInt();
	
		for(int i =0; i<x; i++) { //basamak sayýsýna göre iþlemleri yapýyoruz
			for(int n=x; n>(x-i); n-- ){ //her basamak için boþluk ayarlamasý yapýyoruz.
				System.out.print(" ");
			}
			for(int a =0; a<((x-i)*2-1); a++) { //basamaða yýldýz atama.
				System.out.print("*");
			}
			System.out.println();	
		}
	
	}

}
