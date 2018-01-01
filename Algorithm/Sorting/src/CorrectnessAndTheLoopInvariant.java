//https://www.hackerrank.com/challenges/correctness-invariant/problem
import java.util.Scanner;

public class CorrectnessAndTheLoopInvariant {
	public static void insertionSort(int[] arr){
        
		for(int i=1; i<arr.length; i++){
			int v = arr[i];
			int j=i;
			for( ; j>0; j--){
				if(arr[j-1] > v){
					arr[j] = arr[j-1];
				}else{
					break;
				}
			}
			arr[j] = v;
		}
		printArray(arr);
		
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }

}
