import java.util.ArrayList;
//https://www.hackerrank.com/challenges/jesse-and-cookies/problem
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JesseAandCookies {
	static int opCount = 0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for(int i=0; i<N; i++)
			queue.add(in.nextInt());
		while(queue.size() > 1 && queue.peek() < K){
			queue.add(queue.poll() + (queue.poll() * 2));
			opCount++;
		}
		if(queue.peek() < K)
			System.out.println(-1);
		else
			System.out.println(opCount);
	}
	
}
