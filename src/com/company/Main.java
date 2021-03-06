package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        f(5);

    }
    static void f(int n){
        for(int i=1;i<=n-2;i++){
            for(int j=1;j<=2*n-1;j++){
                if(j>=-i+n+1 && j<=i+n-1)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }System.out.println();

        }
        for(int i=n-3;i>=1;i--){
            for(int j=2*n-1;j>=1;j--){
                if (j<=i-1+n && j>=-i+n+1)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }System.out.println();

        }
    }
}
