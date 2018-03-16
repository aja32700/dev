import java.util.Scanner;
import java.util.Random;

public class ME{
	public static void main (String args[]) {
		System.out.println("Zombie [**********] 100 hp");
		System.out.println("Player [**********] 100 hp"); 
		System.out.println("What will you do? \n");
		
		System.out.println("A. Shoot it.");
		System.out.println("B. Grenade it.");
		System.out.println("C. Decapitate it.");
		System.out.println("D. Heal myself!.");
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Choice: ");
		String choice="";
		choice=sc.nextLine();
		System.out.println("Choice is " + choice);

		int hp=100;
		int hpu=100;
		Random r =new Random();
		
		while(hp>0 || hpu>0){
			if(choice.equalsIgnoreCase("a")){
				hp=hp-10;
				System.out.println("You shoot him. It hits but zombie has " + hp + " hp left!");
				if(hp<=0){
					System.out.println("You killed the zombie!");
					break;
				} else{
					int regen=r.nextInt(20)+1;
					hp=hp+regen;
					hpu=hpu-regen;
					System.out.println("Zombie gets mad and attacks you! Deals " + regen + " damage!");
					if(hpu==0) {
						System.out.println("You're a zombie. Boooo!");
					} else{
					    System.out.println("Zombie recovered. It has " + hp + " hp left.");
					    System.out.print("Zombie [");
					    for(int i=0; i<=(hp/10)-1;i++ ){
	                        System.out.print("*");
                        }
                        for(int i=0; i<=10-(hp/10)-1;i++){
	                        System.out.print("-");
                        }
					    System.out.print("] " + hp + " hp\n");
					    
					    System.out.print("Player [");
					    for(int i=0; i<=(hpu/10)-1;i++ ){
	                        System.out.print("*");
                        }
                        for(int i=0; i<=10-(hpu/10)-1;i++){
	                        System.out.print("-");
                        }
					    System.out.print("] " + hpu + " hp\n");
					    
						System.out.println("What will you do?");
						System.out.println("A. Shoot it.");
						System.out.println("B. Grenade it.");
						System.out.println("C. Decapitate it.");
						System.out.println("D. Heal myself!.");
						System.out.println("Enter choice: ");
						choice=sc.nextLine();
						System.out.println("Choice is " + choice);	
					}
				}

			} else if(choice.equalsIgnoreCase("b")){
				System.out.println("You toss a grenade!");
				int miss=r.nextInt(100)+1;
				if(miss<20){
					int regen=r.nextInt(20)+1;
					hp=hp+regen;
					hpu=hpu-hp;
					System.out.println("It missed!");
					System.out.println("Zombie got mad and attacks! Deals " + regen + " damage.");
					System.out.println("Zombie recovered. It has " + hp + "left.");
					System.out.print("Zombie [");
					for(int i=0; i<=(hp/10)-1;i++ ){
	                        System.out.print("*");
                        }
                        for(int i=0; i<=10-(hp/10)-1;i++){
	                        System.out.print("-");
                        }
					    System.out.print("] " + hp + " hp\n");
					    
					    System.out.print("Player [");
					    for(int i=0; i<=(hpu/10)-1;i++ ){
	                        System.out.print("*");
                        }
                        for(int i=0; i<=10-(hpu/10)-1;i++){
	                        System.out.print("-");
                        }
					    System.out.print("] " + hpu + " hp\n");
					    
					System.out.println("What will you do?");
					System.out.println("A. Shoot it.");
					System.out.println("B. Grenade it.");
					System.out.println("C. Decapitate it.");
					System.out.println("D. Heal myself!.");
					System.out.println("Enter choice: ");
				} else{
					hp=hp-30;
					if(hp==0){
					System.out.println("You killed the zombie!");
					break;
					} else{
						int regen=r.nextInt(20)+1;
						hp=hp+regen;
						hpu=hpu-regen;
						System.out.println("Zombie get hit, dealing 30 damage!");
						System.out.println("Zombie got mad and attacks! Deals " + regen + " damage.");
						System.out.println("Zombie recovered. It has " + hp + "left.");
						System.out.print("Zombie [");
						for(int i=0; i<=(hp/10)-1;i++ ){
	                        System.out.print("*");
                        }
                        for(int i=0; i<=10-(hp/10)-1;i++){
	                        System.out.print("-");
                        }
					    System.out.print("] " + hp + " hp\n");
					    
					    System.out.print("Player [");
					    for(int i=0; i<=(hpu/10)-1;i++ ){
	                        System.out.print("*");
                        }
                        for(int i=0; i<=10-(hpu/10)-1;i++){
	                        System.out.print("-");
                        }
					    System.out.print("] " + hpu + " hp\n");
					    
						System.out.println("What will you do?");
						System.out.println("A. Shoot it.");
						System.out.println("B. Grenade it.");
						System.out.println("C. Decapitate it.");
						System.out.println("D. Heal myself!.");
						System.out.println("Enter choice: ");
						choice=sc.nextLine();
						System.out.println("Choice is " + choice);	
					}
				}
			} else if(choice.equalsIgnoreCase("d")){
				hpu=hpu+30;
				System.out.println("You applied first aid! Heals 30 hp. Current hp is " + hpu + ".");
				int regen=r.nextInt(20)+1;
				hp=hp+regen;
				hpu=hpu-regen;
				System.out.println("Zombie gets mad and attacks you! Deals " + regen + " damage!");
				System.out.print("Zombie [");
				for(int i=0; i<=(hp/10)-1;i++ ){
	                System.out.print("*");
                }
                for(int i=0; i<=10-(hp/10)-1;i++){
	                System.out.print("-");
                }
			    System.out.print("] " + hp + " hp\n");
				    
			    System.out.print("Player [");
				for(int i=0; i<=(hpu/10)-1;i++ ){
	               System.out.print("*");
                }
                for(int i=0; i<=10-(hpu/10)-1;i++){
	               System.out.print("-");
                }
				System.out.print("] " + hpu + " hp\n");
					    
				System.out.println("What will you do?");
				System.out.println("A. Shoot it.");
				System.out.println("B. Grenade it.");
				System.out.println("C. Decapitate it.");
				System.out.println("D. Heal myself!.");
				System.out.println("Enter choice: ");
				choice=sc.nextLine();
				System.out.println("Choice is " + choice);	

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
