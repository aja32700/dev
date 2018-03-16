import java.util.Scanner;
import java.util.Random;

public class CS12ME7AngAira{
	public static void main (String args[]) {
	    int num=0;
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=sc.nextInt();
		
		int ctr=0;
		for(int i=2;i<num;i++){
		    if (num%i==0){
		        System.out.println("Not a prime");
		        break;
		    } else{
		        ctr=ctr+1;
		    }
		if(ctr==num-2){
		    System.out.println("Prime");
		}
		}
		
		
	}
}