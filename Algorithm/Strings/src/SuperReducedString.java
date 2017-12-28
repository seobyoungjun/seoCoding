//https://www.hackerrank.com/challenges/reduced-string/problem

import java.util.Scanner;
import java.util.Stack;

public class SuperReducedString {
	static String super_reduced_string(String s){
        // Complete this function
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
        	if(stack.size() == 0 || stack.peek() != s.charAt(i))
        		stack.push(s.charAt(i));
        	else
        		stack.pop();
        }
        String result="";
        if(stack.size()==0){
        	return "Empty String";
        }else{
        	for(int i=0; i<stack.size(); i++)
            	result += stack.get(i);
            
            return result;
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
