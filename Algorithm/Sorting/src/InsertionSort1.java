import java.util.Scanner;

public class InsertionSort1 {
	public static void insertionSort1(int[] ar) {
        // Fill up this function  
        for(int i=ar.length-1; i>=0; i--){
            int insertData = ar[i];
            int j=i-1;
            for(;j>=0; j--){
                if(ar[j] > insertData){
                    ar[j+1] = ar[j];   
                    printArray(ar);
                }else{
                    break;
                }
            }
            ar[j+1] = insertData;
        }
        printArray(ar);
    }
	private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(arr);
        in.close();
    }
}
