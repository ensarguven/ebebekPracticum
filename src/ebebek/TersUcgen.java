package ebebek;

import java.util.Scanner;

public class TersUcgen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		System.out.print("Basamak say�s�n� girin: ");
		x=input.nextInt();
	
		for(int i =0; i<x; i++) { //basamak say�s�na g�re i�lemleri yap�yoruz
			for(int n=x; n>(x-i); n-- ){ //her basamak i�in bo�luk ayarlamas� yap�yoruz.
				System.out.print(" ");
			}
			for(int a =0; a<((x-i)*2-1); a++) { //basama�a y�ld�z atama.
				System.out.print("*");
			}
			System.out.println();	
		}
	
	}

}
