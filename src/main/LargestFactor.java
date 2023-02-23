package main;

public class LargestFactor {
    public static int Largest(int n){
        int ans = 1;
        double factor = 2.0;
        while (factor <=n){
            if (n%factor == 0){
                if (ans < (n/factor))
                    ans = (int)(n/factor);
                else
                    break;
            }
            factor++;
        }
        return ans;
    }
    public static int Largest2(int n){
        for (int x = n/2; x > 1; x--){
            if (n%x==0){
                return x;
            }
        }
        System.out.print(n+": Prime ");
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(Largest(100)); //50
        System.out.println(Largest(9)); //3
        System.out.println(Largest(81)); //27
        System.out.println(Largest(13)); //1
        System.out.println(Largest2(100)); //50
        System.out.println(Largest2(9)); //3
        System.out.println(Largest2(81)); //27
        System.out.println(Largest2(13)); //1
        System.out.println(Largest2(17)); //1
        System.out.println(Largest2(5)); //1
    }
}
