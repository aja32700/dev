import java.util.Scanner;
import java.util.Random;

public class CS12ME10AngAira {
	public static void main (String args[]) {
		int lvl= 0;
		System.out.println("Enter your Level: ");
		Random r =new Random();
	
	    Scanner sc= new Scanner(System.in);
	    lvl=sc.nextInt();
	    int total=0;
	    int c=r.nextInt(8)+1; //color of prism
	    if(c==1){
	    	System.out.println("The beholder casts a Prismatic Spray! A red ray of light hits you!");
	    	System.out.println("Rolling for damage: ");
	    	
	    	for(int i=0;i<10;i++){
	    		int dmg=r.nextInt(6)+1;
	    		System.out.println(dmg);
	    		total=total+dmg;
	    	}
	    	System.out.println("Incoming " + total + " of FIRE damage!");
	    	System.out.println("You tried to dodge the beam.");
		    int save=r.nextInt(20)+1;
		    System.out.println("Rolling a d20: " + save);
		    int lvlmod=save+lvl/2;
		    System.out.println("Adding Level Modifier: " + lvlmod);
		    if(lvlmod>=16){
		    	total=total/2;
		    	System.out.println("You duck and manage to avoid the brunt of the beam. You take " + total + " points of damage. ");
			} else {
				System.out.println("You got shot!");
			}
	    } 
		else if(c==2){
	    	System.out.println("The beholder casts a Prismatic Spray! An orange ray of light hits you!");
	    	System.out.println("Rolling for damage: ");
	    	
	    	for(int i=0;i<10;i++){
	    		int dmg=r.nextInt(6)+1;
	    		System.out.println(dmg);
	    		total=total+dmg;
	    	}
	    	System.out.println("Incoming " + total + " of ACID damage!");
	    	System.out.println("You tried to dodge the beam.");
		    int save1=r.nextInt(20)+1;
		    System.out.println("Rolling a d20: " + save1);
		    int lvlmod1=save1+lvl/2;
		    System.out.println("Adding Level Modifier: " + lvlmod1);
		    if(lvlmod1>=16){
		    	total=total/2;
		    	System.out.println("You duck and manage to avoid the brunt of the beam. You take " + total + " points of damage. ");
			} else{
				System.out.println("You got shot!");
			}
		} 
		else if(c==3){
	    	System.out.println("The beholder casts a Prismatic Spray! A yellow ray of light hits you!");
	    	System.out.println("Rolling for damage: ");
	    	
	    	for(int i=0;i<10;i++){
	    		int dmg=r.nextInt(6)+1;
	    		System.out.println(dmg);
	    		total=total+dmg;
	    	}
	    	System.out.println("Incoming " + total + " of LIGHTNING damage!");
	    	System.out.println("You tried to dodge the beam.");
		    int save2=r.nextInt(20)+1;
		    System.out.println("Rolling a d20: " + save2);
		    int lvlmod2=save2+lvl/2;
		    System.out.println("Adding Level Modifier: " + lvlmod2);
		    if(lvlmod2>=16){
		    	total=total/2;
		    	System.out.println("You duck and manage to avoid the brunt of the beam. You take " + total + " points of damage. ");
			} else{
				System.out.println("You got shot!");
			}
	    } 
		else if(c==4){
	    	System.out.println("The beholder casts a Prismatic Spray! A green ray of light hits you!");
	    	System.out.println("Rolling for damage: ");
	    	
	    	for(int i=0;i<10;i++){
	    		int dmg=r.nextInt(6)+1;
	    		System.out.println(dmg);
	    		total=total+dmg;
	    	}
	    	System.out.println("Incoming " + total + " of POISON damage!.");
	    	System.out.println("You tried to dodge the beam.");
		    int save3=r.nextInt(20)+1;
		    System.out.println("Rolling a d20: " + save3);
		    int lvlmod3=save3+lvl/2;
		    System.out.println("Adding Level Modifier: " + lvlmod3);
		    if(lvlmod3>=16){
		    	total=total/2;
		    	System.out.println("You duck and manage to avoid the brunt of the beam. You take " + total + " points of damage. ");
			} else{
				System.out.println("You got shot!");
			}
	    } 
		else if(c==5){
	    	System.out.println("The beholder casts a Prismatic Spray! A blue ray of light hits you!");
	    	System.out.println("Rolling for damage: ");
	    	
	    	for(int i=0;i<10;i++){
	    		int dmg=r.nextInt(6)+1;
	    		System.out.println(dmg);
	    		total=total+dmg;
	    	}
	    	System.out.println("Incoming " + total + " of ICE damage!.");
	    	System.out.println("You tried to dodge the beam.");
		    int save4=r.nextInt(20)+1;
		    System.out.println("Rolling a d20: " + save4);
		    int lvlmod4=save4+lvl/2;
		    System.out.println("Adding Level Modifier: " + lvlmod4);
		    if(lvlmod4>=16){
		    	total=total/2;
		    	System.out.println("You duck and manage to avoid the brunt of the beam. You take " + total + " points of damage. ");
			} else{
				System.out.println("You got shot!");
			}
	    } 
		else if(c==6){
	    	System.out.println("The beholder casts a Prismatic Spray! A indigo ray of light hits you!");
	    	System.out.println("You tried to dodge the beam.");
		    int save5=r.nextInt(20)+1;
		    System.out.println("Rolling a d20: " + save5);
		    int lvlmod5=save5+lvl/2;
		    System.out.println("Adding Level Modifier: " + lvlmod5);
		    if(lvlmod5>=16){
		    	System.out.println("You duck and manage to avoid the brunt of the beam.");
		    } else{
		    	System.out.println("You got RESTRAINED!");
		    }
	    }
		else if(c==7){
	    	System.out.println("The beholder casts a Prismatic Spray! A violet ray of light hits you!");
	    	System.out.println("You tried to dodge the beam.");
		    int save6=r.nextInt(20)+1;
		    System.out.println("Rolling a d20: " + save6);
		    int lvlmod6=save6+lvl/2;
		    System.out.println("Adding Level Modifier: " + lvlmod6);
		    if(lvlmod6>=16){
		    	System.out.println("You duck and manage to avoid the brunt of the beam.");
		    } else{
		    	System.out.println("You got BLINDED!");
		    }
	    } 
		else{
	    	System.out.println("No effect!");
			}
		
		
	}
}
	
