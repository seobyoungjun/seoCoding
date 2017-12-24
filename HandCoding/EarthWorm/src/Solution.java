
public class Solution {
	static int Array[][] = {
			{1,2,3,4,5},
			{6,7,8,9,10},
			{11,12,13,14,15},
			{16,17,18,19,20},
			{21,22,23,24,25}
			};

	static int visit[][] = new int[Array.length][Array[0].length];
	public static void main(String[] args) {
		startEarthWorm(0, 0);
	}
	public static void startEarthWorm(int y, int x){
		visit[y][x] = 1;
		System.out.printf("%d ",Array[y][x]);
		// ¿Þ -> ¿À
		if(x+1 < Array[0].length && visit[y][x+1] == 0){
			if(y-1 >= 0  && visit[y-1][x] == 0)
				startEarthWorm(y-1, x);
			else
				startEarthWorm(y, x+1);
		}
		// À§ -> ¾Æ
		if(y+1 < Array.length && visit[y+1][x] == 0){
			startEarthWorm(y+1, x);
		}
		// ¿À -> ¿Þ
		if(x-1 >= 0 && visit[y][x-1] == 0){
			startEarthWorm(y, x-1);
		}
		// ¾Æ -> À§
		if(y-1 >= 0  && visit[y-1][x] == 0){
			startEarthWorm(y-1, x);
		}
	}
}
