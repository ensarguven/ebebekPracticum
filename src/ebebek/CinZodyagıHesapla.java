package ebebek;

import java.util.Scanner;

public class CinZodyagýHesapla {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int yil;
		int kalan;
					
			
		System.out.print("Dogum yilinizi giriniz : ");
		yil = input.nextInt();
		kalan = yil % 12; //mod alma islemi
		
		
		switch(kalan) {	
		case 0:
			System.out.println("Cin Zodyagý Burcunuz : Maymun");
			break;
		case 1:
			System.out.println("Cin Zodyagý Burcunuz : Horoz");
			break;
		case 2:
			System.out.println("Cin Zodyagý Burcunuz : Kopek");
			break;
		case 3:
			System.out.println("Cin Zodyagý Burcunuz : Domuz");
			break;
		case 4:
			System.out.println("Cin Zodyagý Burcunuz : Fare");
			break;
		case 5:
			System.out.println("Cin Zodyagý Burcunuz : Okuz");
			break;
		case 6:
			System.out.println("Cin Zodyagý Burcunuz : Kaplan");
			break;
		case 7:
			System.out.println("Cin Zodyagý Burcunuz : Tavsan");
			break;
		case 8:
			System.out.println("Cin Zodyagý Burcunuz : Ejderha");
			break;
		case 9:
			System.out.println("Cin Zodyagý Burcunuz : Yýlan");
			break;	
		case 10:
			System.out.println("Cin Zodyagý Burcunuz : At");
			break;
		case 11:
			System.out.println("Cin Zodyagý Burcunuz : Koyun");
			break;	
				
		}
		
	
	
	}
	
	
	
	
	

}
