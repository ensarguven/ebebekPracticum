package ebebek;

import java.util.Scanner;

public class vucutKitleEndeks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double m;
		double kg;
		
		System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		m = input.nextDouble();
		
		System.out.println("Lütfen kilonuzu giriniz : ");
		kg = input.nextDouble();
		
		double sonuc = kg /(m*m);
		
		System.out.println("Vücut Kitle Ýndeksiniz : " + sonuc);
		
		
	}

}
