//https://www.hackerrank.com/challenges/missing-numbers/problem
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class MissingNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int m = in.nextInt();
		int[] brr = new int[m];
		for (int brr_i = 0; brr_i < m; brr_i++) {
			brr[brr_i] = in.nextInt();
		}
		int count[] = new int[10001];

		for (int i = 0; i < arr.length; i++)
			count[arr[i]]--;
		for (int i = 0; i < brr.length; i++)
			count[brr[i]]++;

		for (int i = 0; i < count.length; i++)
			if (count[i] > 0)
				System.out.printf("%d ", count[i]);

		System.out.println("");

		in.close();
	}
}
