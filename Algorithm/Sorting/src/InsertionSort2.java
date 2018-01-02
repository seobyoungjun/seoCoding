//https://www.hackerrank.com/challenges/insertionsort2/problem
import java.util.Scanner;

public class InsertionSort2 {
	static void insertionSort2(int n, int[] arr) {
        // Complete this function
        for(int i=1; i<n; i++){
            int v = arr[i];
            
            for(int j=i; j>0; j--){
                if(v < arr[j-1]){
                    arr[j] = arr[j-1];
                    arr[j-1] = v;
                } 
            }
            //print
            for(int z=0; z<n; z++)
                System.out.printf("%d ",arr[z]);
            System.out.println();
                
                    
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort2(n, arr);
        in.close();
    }
}