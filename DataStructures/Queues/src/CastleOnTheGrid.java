//https://www.hackerrank.com/challenges/castle-on-the-grid/problem

import java.util.Scanner;

public class CastleOnTheGrid {
	static boolean[][] check;
	static int curved = 0;

	static int minimumMoves(boolean[][] check, int startX, int startY, int goalX, int goalY, String curve) {
		check[startX][startY] = true;

		if(startX == goalX && startY == goalY)
			return curved;
		// Down
		if (startX+1 < check.length && !check[startX + 1][startY]) {
			//System.out.println("down");
			if(!curve.equals("down"))
				curved++;
			minimumMoves(check, startX+1, startY, goalX, goalY, "down");
		}
		// Up
		if (startX-1 > 0 && !check[startX - 1][startY]) {
			//System.out.println("up");
			if(!curve.equals("up"))
				curved++;
			minimumMoves(check, startX-1, startY, goalX, goalY, "up");
		}

		// Right
		if (startY+1 < check.length && !check[startX][startY + 1]) {
			//System.out.println("right");
			if(!curve.equals("right"))
				curved++;
			minimumMoves(check, startX, startY+1, goalX, goalY, "right");
		}
		// Left
		if (startY-1 > 0 && !check[startX][startY - 1]) {
			//System.out.println("left");
			if(!curve.equals("left"))
				curved++;
			minimumMoves(check, startX, startY-1, goalX, goalY, "left");
		}
		return curved;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		check = new boolean[n][n];
		String[] grid = new String[n];
		for (int grid_i = 0; grid_i < n; grid_i++) {
			grid[grid_i] = in.next();
		}

		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[i].length(); j++)
				if (grid[i].charAt(j) == 'X')
					check[i][j] = true;

		int startX = in.nextInt();
		int startY = in.nextInt();
		int goalX = in.nextInt();
		int goalY = in.nextInt();
		int result = minimumMoves(check, startX, startY, goalX, goalY, "");
		System.out.println(result);
		in.close();
	}
}
