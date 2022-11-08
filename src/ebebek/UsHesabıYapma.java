package ebebek;

import java.util.Scanner;

public class UsHesabýYapma {
	
	static int recursiv(int x, int y) {
		if(x>0)
		{
			x--;
			return y * recursiv(x, y);
		}
		else {
		      return 1;
		    }
		
		
	}
	public static void main(String[] args) {
		
		Scanner input = new	Scanner(System.in);
		int us;
		int sayi;
		
		System.out.println("us giriniz : ");
		us = input.nextInt();
		System.out.println("us alýnacak sayiyi giriniz: ");
		sayi = input.nextInt();
		
		System.out.println(recursiv(us, sayi));
		
	}
	


}
