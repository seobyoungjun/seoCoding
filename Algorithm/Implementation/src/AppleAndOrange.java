//https://www.hackerrank.com/challenges/apple-and-orange/problem
import java.util.Scanner;

public class AppleAndOrange {
	static int[] appleAndOrange(int s, int t, int a, int b, int[] apple, int[] orange) {
        // Complete this function
        int[] AppleOrange = new int[2];
        for(int i=0; i<apple.length; i++)
        	if(s<=a+apple[i] && a+apple[i]<=t)
        		AppleOrange[0]++;
        for(int i=0; i<orange.length; i++)
        	if(s<=b+orange[i] && b+orange[i]<=t)
        		AppleOrange[1]++;
        return AppleOrange;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int[] result = appleAndOrange(s, t, a, b, apple, orange);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
