package ebebek;

public class AsalSayýBulma {

	public static void main(String[] args) {
		
		System.out.println("asal bulma");
		
		 for(int i=2; i<100; i++) {
			 int jump = 0; 

			 for(int n=2; n<i; n++) {

				 if(i%n==0) {
					 jump=1;  //asal olmadýðý anlaþýlýyor
					 break;  //ic döngüden cýkýyoruz.
				 }			 
			 }
			 if(jump==0) {  
				 System.out.print(i+" ");
			 }		 
		
		 }
				 
	}
 }
		

	


