import java.util.Scanner;
import java.util.Random;

public class Fireball{
	public static void main (String args[]) {
		System.out.println("The zombie has 100hp. What will you do?");
		System.out.println("A. Shoot it.");
		System.out.println("B. Grenade it.");
		System.out.println("C. Decapitate it.");
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Choice: ");
		String choice="";
		choice=sc.nextLine();
		System.out.println("Choice is " + choice);

		int hp=100;
		Random r =new Random();
		while(hp>0){
			if(choice.equalsIgnoreCase("a")){
				hp=hp-10;
				System.out.println("You shoot him. It hits but zombie has " + hp + " left!");
				if(hp==0){
					System.out.println("You killed the zombie!");
					break;
				} else{
					int regen=r.nextInt(20)+1;
				hp=hp+regen;
				System.out.println("Zombie recovered. It has " + hp + "left.");
				System.out.println("The zombie has " + hp + ". What will you do?");
				System.out.println("Enter choice: ");
				choice=sc.nextLine();
				System.out.println("Choice is " + choice);
				}

			} else if(choice.equalsIgnoreCase("b")){
				System.out.println("You toss a grenade!");
				int miss=r.nextInt(100)+1;
				if(miss<20){
					int regen=r.nextInt(20)+1;
					hp=hp+regen;
					System.out.println("It missed!");
					System.out.println("Zombie recovered. It has " + hp + "left.");
					System.out.println("The zombie has" + hp + " left. What will you do?");
					System.out.println("Enter choice: ");
				} else{
					hp=hp-30;
					System.out.println("It hits! It has " + hp + "left.");
					if(hp==0){
					System.out.println("You killed the zombie!");
					break;
					} else{
						int regen=r.nextInt(20)+1;
						hp=hp+regen;
						System.out.println("Zombie recovered. It has " + hp + "left.");
						System.out.println("The zombie has" + hp + " left. What will you do?");
						System.out.println("Enter choice: ");
						choice=sc.nextLine();
						System.out.println("Choice is " + choice);	
					}
				}
			} else{
				System.out.println("You launch your final attack!");
				int miss=r.nextInt(100)+1;
				if(miss<50){
					System.out.println("But it missed! Congratulations! You're a zombie!");
					break;
				} else{
					System.out.println("Congratulations! You saved mankind!");
					break;
				}
			}			
		}
			 
		
		

	}
}