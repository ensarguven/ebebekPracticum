package ebebek;

import java.util.Scanner;

public class CinZodyag�Hesapla {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int yil;
		int kalan;
					
			
		System.out.print("Dogum yilinizi giriniz : ");
		yil = input.nextInt();
		kalan = yil % 12; //mod alma islemi
		
		
		switch(kalan) {	
		case 0:
			System.out.println("Cin Zodyag� Burcunuz : Maymun");
			break;
		case 1:
			System.out.println("Cin Zodyag� Burcunuz : Horoz");
			break;
		case 2:
			System.out.println("Cin Zodyag� Burcunuz : Kopek");
			break;
		case 3:
			System.out.println("Cin Zodyag� Burcunuz : Domuz");
			break;
		case 4:
			System.out.println("Cin Zodyag� Burcunuz : Fare");
			break;
		case 5:
			System.out.println("Cin Zodyag� Burcunuz : Okuz");
			break;
		case 6:
			System.out.println("Cin Zodyag� Burcunuz : Kaplan");
			break;
		case 7:
			System.out.println("Cin Zodyag� Burcunuz : Tavsan");
			break;
		case 8:
			System.out.println("Cin Zodyag� Burcunuz : Ejderha");
			break;
		case 9:
			System.out.println("Cin Zodyag� Burcunuz : Y�lan");
			break;	
		case 10:
			System.out.println("Cin Zodyag� Burcunuz : At");
			break;
		case 11:
			System.out.println("Cin Zodyag� Burcunuz : Koyun");
			break;	
				
		}
		
	
	
	}
	
	
	
	
	

}
