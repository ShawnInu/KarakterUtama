import java.util.Random;
import java.util.Scanner;

public class No1Prak8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rndm = new Random();
		
		System.out.print("Strength Andi: ");
		int strengthAndi = scan.nextInt();
		System.out.print("Jumlah boss: ");
		int n = scan.nextInt();
		
		int[] boss = new int[n];
		int[] bonus = new int[n];
		String[] tempKataBoss = new String[n];
		
		
		for(int i=0;i<n;i++) {
			System.out.print("Strength Boss "+(i+1)+":");
			boss[i] = scan.nextInt();
			bonus[i] = rndm.nextInt(30);
			System.out.println("Bonus Strength Dari Boss "+(i+1)+ ": "+bonus[i]);
			tempKataBoss[i]="Boss "+i;
			
		}	
		
		for(int i=0;i<n;i++ ) {
			for(int j=0;j<n;j++) {
				int tempBoss = boss[i];
				int tempBoss1 = boss[j];
				int tempBonus = bonus[i];
				int tempBonus1 = bonus[j];
				String tempString = tempKataBoss[i];
				String tempString1 = tempKataBoss[j];
				if(boss[i]<boss[j]) {
					boss[i] = tempBoss1;
					bonus[i] = tempBonus1;
					tempKataBoss[i] = tempString1;
					boss[j]= tempBoss;
					bonus[j]= tempBonus;
					tempKataBoss[j] = tempString;
				}
				
			}
		}
		boolean victory=true;
		int count = 0;
		for(int i=0;i<n;i++) {
			if(strengthAndi>boss[i]) {
				strengthAndi+=bonus[i];
				count++;
				victory =true;
			}
			else {
				victory=false;
				break;
			}
		}
		
		if(victory) {
			System.out.print("Andi sukses membersihkan area dengan urutan: ");
			for(int i=0;i<count;i++) {
				System.out.print(tempKataBoss[i+1]+", ");
			}
		}
		else {
			System.out.print("Andi gagal membersihkan area, petualangan Andi berhenti setelah mengalahkan: ");
			for(int i=0;i<count;i++) {
				System.out.print(tempKataBoss[i+1]+", ");
			}
		}
		
		

	}

}

