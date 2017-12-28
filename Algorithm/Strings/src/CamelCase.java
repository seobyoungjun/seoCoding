//https://www.hackerrank.com/challenges/camelcase/problem

import java.util.Scanner;

public class CamelCase {
	static int camelcase(String s) {
        // Complete this function
		if(s.length()==0){
			return 0;
		}else{
			int result = 1;
			for(int i=0; i<s.length(); i++){
				if(65<=s.charAt(i) && s.charAt(i)<=90)
					result++;
			}
			return result;
		}
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}
