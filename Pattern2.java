package nestedloop;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = s.nextInt();
		s.close();
		for(int i= 1;i<=n ;i++){
			for(int j =1;j<=n-i+1;j++){
				System.out.print("* ");
				
			}	
			
			
			System.out.println();
		}

	}

}
