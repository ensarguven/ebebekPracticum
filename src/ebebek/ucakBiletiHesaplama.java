package ebebek;

import java.util.Scanner;

public class ucakBiletiHesaplama {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in );
		
		float mesafe;
		int yas;
		int yolculukTipi;
		float yasIndirimi;
		float normalTutar;
		float indirimliTutar =0;
		int yolculukTipi1;
		float gidisDonusBiletIndirimi;
		float toplamTutar;
		
	
		
		System.out.print("Gideceginiz mesafeyi km olarak giriniz :  ");
		mesafe = input.nextFloat();
		normalTutar = (float) (mesafe*0.10) ;
		
		System.out.print("Yasýnýzý giriniz : ");
		yas = input.nextInt();
		
		
		
		if(yas >0 & mesafe >0  )
		{
			System.out.println("Normal Tutar : "+normalTutar);
		
			if(yas<12) {
				yasIndirimi = (normalTutar * 50/100);
				indirimliTutar =normalTutar - yasIndirimi;
				System.out.println("Indirimli Tutar " + indirimliTutar);
			}
			
			if(yas>12 & yas <24) {
				yasIndirimi = (normalTutar * 10/100);
				indirimliTutar =normalTutar - yasIndirimi;
				System.out.println("Indirimli Tutar " + indirimliTutar);
					
			}
			if(yas>65) {
				yasIndirimi = (normalTutar * 30/100);
				indirimliTutar =normalTutar - yasIndirimi;
				System.out.println("Indirimli Tutar " + indirimliTutar);
					
			}
			System.out.print("yolculuk tipinizi giriniz : ");
			yolculukTipi1 = input.nextInt();
			
			switch(yolculukTipi1) {
			
			case 1:
				System.out.println("Toplam Tutar :"+indirimliTutar);
				break;
				
			case 2:
				
				gidisDonusBiletIndirimi = indirimliTutar * 20/100;
				toplamTutar = indirimliTutar - gidisDonusBiletIndirimi;
				
				System.out.println("Gidis Dönüþ Bileti Ýndirimi : " +gidisDonusBiletIndirimi);
				System.out.println("Toplam tutar :"+ toplamTutar);
			
			}		
		
		}
		
		else {
			System.out.println("Hatali giris yaptiniz ");
		}
		
	}

}
