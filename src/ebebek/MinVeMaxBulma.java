package ebebek;
import java.util.Scanner;

public class MinVeMaxBulma {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 int x;
		 int min, max;
		 System.out.print("Kaç tane sayi gireceksiniz: ");
		 x= input.nextInt();
		 
		 int[] dizi = new int[x];
		
		
	        for (int i = 0; i < dizi.length; i++) {
	        	System.out.print(i+1+".sayýyý giriniz: ");
	        	
	        	dizi[i] = input.nextInt();
	            //System.out.println(i+1+".sayiyi giriniz: "+dizi[i] );
	            
	        }
	 
	        max = dizi[0];
	        min = dizi[0];
	        for (int i = 0; i < dizi.length; i++) {
	        	if(min > dizi[i])
	                min = dizi[i];
	        	if(max< dizi[i]) {
	        		max = dizi[i];
	        	}
	        }
	 
	        System.out.println("En kucuk: "+min);
	        System.out.println("En buyuk: "+max);

					 
			 
		 }
		

	}


