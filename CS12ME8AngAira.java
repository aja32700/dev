//package CS12ME8AngAira;

import java.util.Scanner;

public class CS12ME8AngAira {
	private static Scanner sc;
	public static void main (String args[]) {
	    int ctr=0;
	    sc = new Scanner(System.in);
		System.out.println("Enter letter: ");
		char letter=sc.nextLine().charAt(0);	
		
		System.out.println("Enter word: ");
		String word="";
		word=sc.nextLine();
		
		int len=word.length();
		//char x= '_';
		
		
		for(int i=0; i<len; i++){
			if (letter==word.charAt(i)){
				System.out.print("_");
			} else{
				System.out.print(word.charAt(i));
			}
		}
		
		
		
		
	}
}
