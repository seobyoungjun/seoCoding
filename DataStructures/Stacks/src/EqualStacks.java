import java.util.Scanner;

public class EqualStacks {
	static int n1m = 0, n2m = 0, n3m = 0;
	static int index1 = 0, index2 = 0, index3 = 0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		
		int h1[] = new int[n1];
		for (int h1_i = 0; h1_i < n1; h1_i++) {
			h1[h1_i] = in.nextInt();
			n1m += h1[h1_i];
			
		}
		int h2[] = new int[n2];
		for (int h2_i = 0; h2_i < n2; h2_i++) {
			h2[h2_i] = in.nextInt();
			n2m += h2[h2_i];
		}
		int h3[] = new int[n3];
		for (int h3_i = 0; h3_i < n3; h3_i++) {
			h3[h3_i] = in.nextInt();
			n3m += h3[h3_i];
		}
		//confuse
		while(n1m != n2m || n2m != n3m || n1m != n3m){

			if(n1m > n2m)
				if(n1m > n3m)
					n1m -= h1[index1++];
				else
					if(n2m > n3m)
						n2m -= h2[index2++];
					else
						n3m -= h3[index3++];
			else
				if(n2m > n3m)
					n2m -= h2[index2++];
				else
					if(n3m > n1m)
						n3m -= h3[index3++];
					else
						n1m -= h1[index1++];
		}
		System.out.println(n1m);
		
	}
	
}
