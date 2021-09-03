package nestedloop;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter n valule");
		int n  = s.nextInt();
		s.close();//you should close the scanner object because that memory can be used for some other purpose instead of holding it in.
		for(int i = 1;i<=n;i++){
			
			for(int j = 5;j>=i;j--){
				//if(i == j) System.out.print(" ");
				System.out.print("* ");
			}
			//System.out.print("*");
			System.out.println();
		}

	}

}
