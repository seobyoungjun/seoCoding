import java.util.ArrayList;
import java.util.Scanner;

public class QueueUsingTwoStacks {
	static class sQueue{
		ArrayList<Integer> list;
		public sQueue(){
			list = new ArrayList<>();
		}
		public void enqueue(int v){
			list.add(v);
		}
		public void dequeue(){
			if(list.size()!=0)
				list.remove(0);
		}
		public void print(){
			if(list.size()!=0)
				System.out.println(list.get(0));
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		sQueue queue = new sQueue();
		for(int i=0; i<N; i++){
			int type = in.nextInt();
			switch (type) {
			case 1:
				int x = in.nextInt();
				queue.enqueue(x);
				break;
			case 2:
				queue.dequeue();
				break;
			case 3:
				queue.print();
				break;

			}
		}
	}
}
