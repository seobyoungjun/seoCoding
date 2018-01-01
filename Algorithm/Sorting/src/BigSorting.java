//https://www.hackerrank.com/challenges/big-sorting/problem

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSorting {
	static String[] bigSorting(String[] arr) {
		// Complete this function
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return StringCompare(o1, o2);
			}
		});
		return arr;
	}

	public static int StringCompare(String o1, String o2) {
		if (o1.length() > o2.length())
			return 1;
		if (o1.length() < o2.length())
			return -1;
		for (int i = 0; i < o1.length(); i++) {
			if ((int) o1.charAt(i) > (int) o2.charAt(i))
				return 1;
			if ((int) o1.charAt(i) < (int) o2.charAt(i))
				return -1;
		}

		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] arr = new String[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.next();
		}
		String[] result = bigSorting(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

		in.close();
	}
}
