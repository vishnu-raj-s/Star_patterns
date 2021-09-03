package nestedloop;

import java.util.Scanner;

public class AdvancedPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = s.nextInt();
		s.close();
		for(int i = 1;i<=2*n;i++){
			if(i<=2*n/2){
				for(int j = 1;j<=n-i;j++){
					System.out.print("  ");
				}
				for(int j = 1;j<=i;j++){
					System.out.print(" *  ");
			}
				}

		else{
				for(int j = 1;j<=2*n-i+1;j++){
					System.out.print(" ");
				}
				for(int j = 1;j<= 2*n-i;j++){
					System.out.print("*   ");
				}
		}
						
			
			System.out.println();	
		}
		
	}

}

