import java.util.Scanner;
import java.util.Random;

public class Me3{
	public static void main (String args[]) {
		Random r =new Random();
		int stat= 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter IntStat: ");
		stat= sc.nextInt(); //convert to int
		System.out.println("Int Stat is:  " + stat + ".");

		//spell dc
		int dc= (stat-10)/2+4;
		System.out.println("Spell DC: " + dc);

		//dmg
		int total=0;

		for(int x=0;x<=7;x++){
			int z=r.nextInt(6)+1;
			System.out.println(z);
			total=total+z;
		}
		System.out.println("Total damage: " + total);

		//dex
		System.out.print("Enter DexStat: ");
		int dex= sc.nextInt();

		int a=r.nextInt(20)+1;
		System.out.println("Enemy die rolls: "+ a);
		int dst=(dex-10)/2 + a;
		System.out.println("Dex saving throw: " + dst);

		if (dc>=dst){
			System.out.println("Enemy gets full damage! Dealt " + total + " damage.");
		} else{
			total=total/2;
			System.out.println("Enemy dodges and got slightly burnt. Dealt " + total + " damage.");
		}


		


	}
}