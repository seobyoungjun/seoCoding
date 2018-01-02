import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class IceCreamParlor {
	static int[] icecreamParlor(int m, int[] arr) {
        // Complete this function
		int result[] = new int[2];
			
		int one=0, two=0;
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]+arr[j] == m){
					result[0] = i+1;
					result[1] = j+1;
				}
			}
		}
		return result;
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int[] result = icecreamParlor(m, arr);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
        in.close();
    }
}
