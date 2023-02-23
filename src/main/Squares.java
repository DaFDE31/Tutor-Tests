package main;

import java.util.*;
public class Squares {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] squares = new int[10];
        int sum = 0;
        for (int i = 0; i <10; i++){
            System.out.print("Enter a number: ");
            int in = scan.nextInt();
            squares[i] = in*in;
            sum += in*in;
        }
        for (int i:squares){
            System.out.println(i);
        }
        System.out.println(sum);

    }
}
