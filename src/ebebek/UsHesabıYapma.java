package ebebek;

import java.util.Scanner;

public class UsHesabıYapma {

	
	   static int as(int i) {
	        if (i < 2) {
	        	return 3;
	        	}
	        else return (i * as(i - 1));
	    }

	    public static void main(String[] args) {
	        System.out.println(as(3));
	    }

}
