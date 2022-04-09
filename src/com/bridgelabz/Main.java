package com.bridgelabz;

public class Main {

    public static void main(String[] args) {
        int result=1,n=Integer.parseInt(args[0]);
        if(n<0&&n>31) {
            System.out.println(" value of N :  " + n);
            System.out.println(" It should be greater than 0 and lower than 31");
        }
        else{
            for(int i = 1;i<=n;i++)
            {
                result=result*2;
                System.out.println("2^"+i+" : "+result);
            }
        }
    }
}
