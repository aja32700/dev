//  comment
//  code is inside class
//  name of class=filename
//  every new word is capitalized (formal)


import java.util.Scanner;
import java.util.Random;

public class HelloWorld2{
	public static void main (String args[]) {
		System.out.println("Hello World!");
		int x=0; //declaring var (MUST)/ initializing(optional)
		//or int x=0,y=0,z=0; --->multiple var
		Scanner sc = new Scanner(System.in); //--->scanner as keyword for inputs
		// just once ^
		System.out.print("Enter your name:");
		String name=""; // empty string for input
		name= sc.nextLine();
		System.out.println("Hello " + name + "!"); //print output

		
		System.out.print("Enter your age:");
		int age= 0;
		age= Integer.parseInt(sc.nextLine()); //convert to int
		System.out.println("you are " + age + " years old");
		int year;
		year = 2018- age;
		System.out.println("You were born in " + year);

		//ifs
		//!= not equal

		if(age<=16){
			System.out.println("can't drink");
		} else if(age==17){
			System.out.println("drink moderately");
		} else{
			System.out.println("go drunk");
		}

		//name==____ SOMETIMES works; no compile error
		if(name.equals("___")){
			System.out.println("_______");
		} else if (!name.equals.("___")){ //not equal strings
			System.out.println("not euqal");
		}

		System.out.println("Roll dice! (6 sided die)");
		Random r =new Random(); // only once
		int z=r.nextInt(6)+1; //nextInt=0 to smth -1 so +1 to reach 6
		System.out.println("number is " +  z);
		
		//added System.out.print();
	}
}



// compile: javac <filename>.java
// execute: java <filename>