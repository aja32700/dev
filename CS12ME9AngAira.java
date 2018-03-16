//package CS12ME8AngAira;

import java.util.Scanner;

public class CS12ME9AngAira {
	public static void main (String args[]) {
	    int num=0;
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=sc.nextInt();
			
		int ctr=0;
		
		
		for(int i=2; i<=num;i++){
			int check=0;
			for(int j=2;j<i;j++){
			    if (i%j==0){
			    	check=1;
			    	break;
			    } 
			}
			
			if (check==0){
				System.out.println(i);
				ctr=ctr+1;
				
			}
		}	
		System.out.println("number of primes: " + ctr);
	}
}
