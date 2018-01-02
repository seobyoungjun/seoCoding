import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class MissingNumbers {
	static int[] missingNumbers(int[] arr, int[] brr) {
        // Complete this function
		int arrA[] = new int[100];
		int arrB[] = new int[100];
		
		int mul = 0;
		int temp = arr[0];
		while(temp != 0){
			temp /= 100;
			mul++;
		}
		
		for(int i=0; i<arr.length; i++)
			arrA[arr[i]%100]++;
		for(int i=0; i<brr.length; i++)
			arrB[brr[i]%100]++;
		
		for(int i=0; i<100; i++)
			if(arrA[i] != arrB[i])
				System.out.println("i : "+((mul*100)+i) + "| arrA : " + arrA[i] +"/ arrB : " + arrB[i]);
		
		return new int[2];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] brr = new int[m];
        for(int brr_i = 0; brr_i < m; brr_i++){
            brr[brr_i] = in.nextInt();
        }
        int[] result = missingNumbers(arr, brr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
