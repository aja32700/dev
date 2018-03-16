import java.util.Scanner;
import java.util.Random;

public class Me1{
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		String p="";
		System.out.print("Enter your name:");
		p=sc.nextLine();
		System.out.println("P1: " + p);

		String pp="";
		System.out.print("Enter your name:");
		pp=sc.nextLine();
		System.out.println("P2: " + pp);
		
		
		
		String pc="";
		System.out.print("Enter your choice:");
		pc=sc.nextLine();
		String ppc="";
		System.out.print("Enter your choice:");
		ppc=sc.nextLine();

		if(pc.equals("paper")){
			if (ppc.equals("rock")){
				System.out.println("Player 1 wins!");
			} 
			
			else if (ppc.equals("scissors")){
				System.out.println("Player 2 wins!");
			}

			else{
				System.out.println("Draw!");
			}

			
		} else if (pc.equals("rock")){

			if (ppc.equals("paper")){
				System.out.equals("Player 2 wins!");
			} 

			else if (ppc.equals("scissors")){
				System.out.println("Player 1 wins!");
			}

			else {
				System.out.println("Draw!");
			} 
			
		} 
		else {
			if (ppc.equals("paper")){
				System.out.println("Player 1 wins!");
			} 
			else if (ppc.equals("rock")){
				System.out.println("Player 2 wins!");	
			} 
			else {
				System.out.println("Draw!");
			}
			
		}
		

	}
}