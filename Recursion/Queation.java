

import java.util.*;

public class Queation{

    // function used to prin from n to 1 using recursion
    public static void printInc(int n){
        if(n<1){
            return;
        }
        else{
            
            System.out.print(n+" ");
            printInc(n-1);
        }
    }


    // function used to prin from 1 to n using recursion
    public static void printDec(int n){
        // if(n<1){
        //     return 0;
        // }
        // else{
            
        //     int a= printDec(n-1);
        //     System.out.print((a+1)+" ");
        //     return a+1;
        // }


        //we can also use this 

        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printDec(n-1);
        System.out.print(n+" ");
    }

    //function to find factorial
    public static int factorialOf(int n){
        if(n<1){
            return 1;
        }
        int fact = n * factorialOf(n-1);
        return fact;
    }

    // function to find sum of n natural number
    public static int sumOf(int n){
        if(n<1){
            return 0;
        }
        int fact = n +  sumOf(n-1);
        return fact;
    }







    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();

        printInc(a);
         System.out.println();
        printDec(a);

        
         System.out.println("\nfactorial of "+a+" is "+ factorialOf(a));
         System.out.println("sum of "+a+" is "+ sumOf(a));


    }
}