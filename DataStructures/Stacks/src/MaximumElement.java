import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
	static class cStack{
		int[] stack;
		int index;
		int maxIndex;
		public cStack(int N){
			stack = new int[N];
			index = 0;
			maxIndex = 0;
		}
		public void add(int a){
			stack[index] = a;
			if(stack[index] > stack[maxIndex]){
				maxIndex = index;
			}
			index++;
		}
		public void pop(){
			stack[index] = 0;
			index--;
			if(maxIndex == index){
				int max = stack[0];
				maxIndex = 0;
				for(int i=1; i<index; i++){
					if(max < stack[i]){
						maxIndex = i;
						max = stack[i];
					}
				}
			}
			
		}
		public void max(){
			System.out.println(stack[maxIndex]);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		cStack stack = new cStack(N);
		for(int i=0; i<N; i++){
            int type = in.nextInt(); 
            switch(type){
            	case 1:
            		int x = in.nextInt();
            		stack.add(x);
            		break;
            	case 2:
            		stack.pop();
            		break;
            	case 3:
            		stack.max();
            		break;
            }
        }
	}
}
