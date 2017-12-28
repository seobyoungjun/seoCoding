//https://www.hackerrank.com/challenges/grading/problem
import java.util.Scanner;

public class GradingStudents {
	static int[] solve(int[] grades){
        // Complete this function
        for(int i=0; i<grades.length; i++){
        	if(grades[i] >= 38){
        		int grade = 5 * ((grades[i]/5)+1);
                if(grade - grades[i] < 3)
                	grades[i] = grade;
        	} 	
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
