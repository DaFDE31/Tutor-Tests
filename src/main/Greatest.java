package main;

public class Greatest {
    /*
Given an array of integers and a single integer, return the biggest integer from the array that is a multiple of the single integer. If there are none, return 1.
EX: Greatest_Multiple([12,15,17,5], 5) should return 15
*/
    //Given an integer, return its greatest factor that is an integer
    public int Greatest_Factor(int x){
        double x2= (double)x /2.0;
        int i = 2;
        int y = 0;
        while (y != 1){
            if (x2%i == 0){

            }
        }
        return y;
    }


    public static void main(String[] args) {
        String [] names = new String[]{"Danielson"};
        for (int x = 0; x<names.length; x++){
            names[x] = "Danielson";
            System.out.println(names[x]);
        }
        Greatest_Multiple(new int[]{1,2,3,4,5}, 5);

    }
    public static int Greatest_Multiple(int[] arr, int x){
        int i = 1;
        for (int y : arr){
            if(y%x==0)
                i = Math.max(y,i);
        }
        return i;
    }
    public int Greatest_Multiple2(int[] arr, int x) {
        int y = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % x == 0) {
                if (arr[i] > y) {
                    y = arr[i];
                }
            }
        }
        return y;
    }
}
