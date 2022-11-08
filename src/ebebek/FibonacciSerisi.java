package ebebek;
import java.util.Scanner;

public class FibonacciSerisi {

	public static void main(String[] args) {
		int x;
		int a=0,b=1,sonuc;
		Scanner input = new Scanner(System.in);
		System.out.print("eleman girin: ");
		x = input.nextInt();
		
		for(int i=0; i<x; i++) {
			if(i==0) {
				System.out.print(a+" "+b+" ");
			} 
				sonuc = a+b;
				a=b; //bir onceki sayiyi tutuyoruz 
				//System.out.println(b);
				b=sonuc; //mevcut sayiyi tutuyoruz.
				System.out.print(sonuc+" ");
			
			
		}

		

	}

}
