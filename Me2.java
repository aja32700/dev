import java.util.Scanner;
import java.util.Random;

public class Me2{
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your birth MONTH: ");
		String month="";
		month=sc.nextLine();
		System.out.println("Month is: " + month);

		System.out.print("Enter your birth DATE: ");
		int date= 0;
		date= Integer.parseInt(sc.nextLine()); //convert to int
		System.out.println("Date is: " + date);

		if (month.equals("Dec") && (date>=22)&&(date<=31) ) {
			System.out.println("Capricorn");
		} else if(month.equals("Jan") && (date>=1)&&(date<=19) ){
			System.out.println("Capricorn");
		} else if(month.equals("Jan") && (date>=20)&&(date<=31) ){
			System.out.println("Aquarius");
		} else if (month.equals("Feb") && (date>=1)&&(date<=18) ){
			System.out.println("Aquarius");
		} else if (month.equals("Feb") && (date>=19)&&(date<=29) ){
			System.out.println("Pisces");
		} else if (month.equals("Mar") && (date>=1)&&(date<=20)){
			System.out.println("Pisces");
		} else if (month.equals("Mar") && (date>=21)&&(date<=31)){
			System.out.println("Aries");
		} else if (month.equals("Apr") && (date>=1)&&(date<=19)){
			System.out.println("Aries");
		} else if(month.equals("Apr") && (date>=20)&&(date<=30) ){
			System.out.println("Taurus");
		} else if (month.equals("May") && (date>=1)&&(date<=20) ){
			System.out.println("Taurus");
		} else if (month.equals("May") && (date>=21)&&(date<=31) ){
			System.out.println("Gemini");
		} else if (month.equals("June") && (date>=1)&&(date<=20) ){
			System.out.println("Gemini");
		} else if (month.equals("June") && (date>=21)&&(date<=30) ){
			System.out.println("Cancer");
		} else if(month.equals("July") && (date>=1)&&(date<=22) ){
			System.out.println("Cancer");
		} else if (month.equals("July") && (date>=23)&&(date<=31) ){
			System.out.println("Leo");	
		} else if (month.equals("Aug") && (date>=1)&&(date<=22) ) {
			System.out.println("Leo");
		} else if(month.equals("Aug") && (date>=23)&&(date<=31) ){
			System.out.println("Virgo");
		} else if (month.equals("Sept") && (date>=1)&&(date<=22) ){
			System.out.println("Virgo");
		} else if(month.equals("Sept") && (date>=23)&&(date<=30) ){
			System.out.println("Libra");
		} else if (month.equals("Oct") && (date>=1)&&(date<=22) ){
			System.out.println("Libra");
		} else if(month.equals("Oct") && (date>=23)&&(date<=31) ){
			System.out.println("Scorpio");
		} else if(month.equals("Nov") && (date>=1)&&(date<=21) ){
			System.out.println("Scorpio");
		} else if (month.equals("Nov") && (date>=22)&&(date<=30) ){
			System.out.println("Sagittarius");
		} else {
			System.out.println("Sagittarius");
		}
			
		
					

		
	}
		}
		
		
		
		
		
