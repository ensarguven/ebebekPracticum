package ebebek;

import java.util.Scanner;

public class vucutKitleEndeks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double m;
		double kg;
		
		System.out.println("L�tfen boyunuzu (metre cinsinde) giriniz : ");
		m = input.nextDouble();
		
		System.out.println("L�tfen kilonuzu giriniz : ");
		kg = input.nextDouble();
		
		double sonuc = kg /(m*m);
		
		System.out.println("V�cut Kitle �ndeksiniz : " + sonuc);
		
		
	}

}
