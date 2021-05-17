package Assignment_Solutions;
import java.util.*;
import java.lang.Math.*;

public class Solution_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of series : ");
		int n = sc.nextInt();
		System.out.println("Enter the values of a and b : ");
		for(int i = 0;i<n;i++) {	
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a;
			for(int j = 0; j<n;j++) {
				sum =  sum + (int)(Math.pow(2, j) * b);
				System.out.print(sum + " ");
			}
			System.out.println(" ");
		}
		sc.close();
	}

}
