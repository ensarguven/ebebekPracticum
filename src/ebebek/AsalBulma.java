package ebebek;
import java.util.Scanner;

public class AsalBulma {

	static float asalHesab�(float y, float a) {

		
		if(y%a !=0 & a>2) { //al�nan say�y�, bir eksi�inden 0 a kadar b�l�yoruz.
			a--;
			return asalHesab�(y, a);
		}
		if(a==2 & y%a!=0 || y==2) {
			System.out.println("asal");
			return 0;
		}
		else {
			System.out.println("degil");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float sayi;
	    float sonuc;
		
		System.out.println("sayi giriniz: ");
		sayi = input.nextInt();
		float a = sayi-1;
		
		
		System.out.print(asalHesab�(sayi,a));

	}

}
