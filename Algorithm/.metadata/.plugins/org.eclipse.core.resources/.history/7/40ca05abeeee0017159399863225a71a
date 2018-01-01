import java.util.Scanner;

public class RunningTimeOfAlgorithms {
	static int runningTime(int[] arr) {
		int time = 0;
		for(int i=1; i<arr.length; i++){
			int v = arr[i];
			int compareIndex = i;
			for( ;compareIndex > 0; compareIndex--){
				if(arr[compareIndex-1] > v){
					arr[compareIndex]=arr[compareIndex-1];
					time++;
				}else{
					break;
				}
			}
			arr[compareIndex] = v;
		}
		return time;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int result = runningTime(arr);
		System.out.println(result);
		in.close();
	}
}
