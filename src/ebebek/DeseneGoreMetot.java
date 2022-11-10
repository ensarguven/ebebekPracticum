package ebebek;

import java.util.Scanner;

public class DeseneGoreMetot {
	static int desen(int a, int b, int c){
		
		if(a>0 & b==1) { //b degeri, azalttýgýmýz sayi 0 veya - olursa bu kosula bir daha girmemizi sagliyor.
			a= a-5;
			System.out.println(a);
		  //System.out.print(a+" ");
		  return desen(a,b,c);
		}

		else if(a< c-5) { //5 artirma koþulunu desenin sondan birincisinde bitiriyoruz.
			b=2; //yukaridaki kosula bir daha girmemesi icin.
			a=a+5;
			System.out.println(a);
			return desen(a, b, c);
				
		}
		else 
			return c;
				
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x,count=1,y;
		System.out.println("N sayisi: ");
		x=input.nextInt();
		y=x; // kullanýcýnýn girdigi deger ile islem yaptigimiz icin ilk girdigi degeri tutuyoruz. 
		System.out.print(desen(x,count,y));
	
	}

}
