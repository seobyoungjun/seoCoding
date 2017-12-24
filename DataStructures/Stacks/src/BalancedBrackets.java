import java.util.ArrayList;
import java.util.Scanner;

public class BalancedBrackets {
	static class cStack {
		ArrayList<Character> list;

		public cStack() {
			list = new ArrayList<>();
		}

		public void push(char c) {
			list.add(c);
		}

		public char pop() {
			if (list.size() != 0)
				return list.remove(list.size() - 1);
			else
				return ' ';
		}
	}

	static String isBalanced(String s) {
		// Complete this function
		cStack stack = new cStack();
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '[':
				stack.push('[');
				break;
			case '{':
				stack.push('{');
				break;
			case '(':
				stack.push('(');
				break;
			case ']':
				if('[' != stack.pop())
					return "NO";
				break;
			case '}':
				if('{' != stack.pop())
					return "NO";
				break;
			case ')':
				if('(' != stack.pop())
					return "NO";
				break;
			}
		}
		//EXCEPTION!
		if(stack.list.size()!=0)
			return "NO";
		return "YES";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String s = in.next();
			String result = isBalanced(s);
			System.out.println(result);
		}
		in.close();
	}
}
