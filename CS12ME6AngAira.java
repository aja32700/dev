import java.util.Scanner;
import java.util.Random;

public class CS12ME6AngAira{
	public static void main (String args[]) {
	    int ctr=0;
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter letter: ");
		
		char letter=sc.nextLine().charAt(0);
		System.out.println("Letter is " + letter);
		
		System.out.println("Enter word: ");
		String word="";
		word=sc.nextLine();
		System.out.println("Word is " + word);
		
		int len=word.length();
		for(int i=0; i<len; i++){
			if (letter==word.charAt(i){
				ctr=ctr+1;
			}
		}
		System.out.println(ctr)
		
		
	}
}