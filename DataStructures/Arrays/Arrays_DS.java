import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/arrays-ds/problem
public class Arrays_DS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++)
            arr[arr_i] = in.nextInt();
        for(int arr_i = n-1; arr_i >= 0; arr_i--)
            System.out.printf("%d ",arr[arr_i]);
    }
}

