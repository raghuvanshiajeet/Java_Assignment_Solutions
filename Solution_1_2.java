package Assignment_Solutions;
import java.util.*;
public class Solution_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array : ");
		for(int i = 0;i<n;i++)
			arr[i] = sc.nextInt();
		int count = 0;
		for(int i = 0;i<n;i++) {
			int sum = 0;
			for(int j = i;j<n;j++) {
				sum = arr[j] + sum;
				if(sum < 0)
					count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
