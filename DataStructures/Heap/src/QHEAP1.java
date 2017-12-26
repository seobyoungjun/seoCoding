//https://www.hackerrank.com/challenges/qheap1/problem

import java.util.ArrayList;
import java.util.Scanner;

public class QHEAP1 {
	static class heap {
		ArrayList<Integer> list;
		int minV;

		public heap() {
			list = new ArrayList<>();
			minV = Integer.MAX_VALUE;
		}

		public void add(int v) {
			list.add(v);
			if (minV > v)
				minV = v;
		}

		public void delete(int v) {
			if(list.size() != 0){
				for (int i = 0; i < list.size(); i++){
					if (list.get(i) == v){
						list.remove(i);
						break;
					}
				}
			}
			if (minV == v) {
				minV = Integer.MAX_VALUE;
				if (list.size() != 0) {
					for(int i = 0; i < list.size(); i++){
						if(list.get(i) < minV)
							minV = list.get(i);
					}
				}
			}
		}

		public void print() {
			System.out.println(minV);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		heap h = new heap();
		for (int i = 0; i < N; i++) {
			int type = in.nextInt();
			switch (type) {
			case 1:
				int v = in.nextInt();
				h.add(v);
				break;
			case 2:
				int dv = in.nextInt();
				h.delete(dv);
				break;
			case 3:
				h.print();
				break;
			}
		}
	}
}
