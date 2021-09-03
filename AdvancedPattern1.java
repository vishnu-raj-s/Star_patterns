package nestedloop;

import java.util.Scanner;

public class AdvancedPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = s.nextInt();
		s.close();
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=n-i;j++){
				System.out.print("  ");
			}
			for(int j = 1;j<=i;j++){
				System.out.print(" *  ");
			}
			
			System.out.println();	
		}
		
	}

}
