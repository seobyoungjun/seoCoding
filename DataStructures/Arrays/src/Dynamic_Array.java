//https://www.hackerrank.com/challenges/dynamic-array/problem

import java.util.ArrayList;
import java.util.Scanner;

public class Dynamic_Array {
	public static void main(String[] args) {
		int lastAnswer = 0;
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int Q = in.nextInt();
		//1<= N,Q <= 10^5
		ArrayList<Integer> list[] = new ArrayList[N];
		//init
		for(int i=0; i<N; i++){
			list[i] = new ArrayList<>();
		}
		for(int i=0; i<Q; i++){
			int type = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			if(type==1){
				int seq = (x^lastAnswer)%N;
				list[seq].add(y);
			}else{
				int seq = (x^lastAnswer)%N;
				lastAnswer = list[seq].get(y%list[seq].size());
				System.out.println(lastAnswer);
			}
		}
	}
}
