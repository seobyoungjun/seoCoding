//https://www.hackerrank.com/challenges/castle-on-the-grid/problem

import java.util.Scanner;

public class CastleOnTheGrid {

	static int minimumMoves(int[][] visit, int startX, int startY, int goalX, int goalY) {
		visit[startY][startX] = visit[startY][startX]+1;
		
		
		
		return 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] grid = new String[n];
		for (int grid_i = 0; grid_i < n; grid_i++) {
			grid[grid_i] = in.next();
		}
		
		int[][] visit = new int[grid.length][grid[0].length()];
		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[i].length(); j++)
				if (grid[i].charAt(j) == 'X')
					visit[i][j] = -1;

		int startX = in.nextInt();
		int startY = in.nextInt();
		int goalX = in.nextInt();
		int goalY = in.nextInt();
		int result = minimumMoves(visit, startX, startY, goalX, goalY);
		System.out.println(result);
		in.close();
	}
}
