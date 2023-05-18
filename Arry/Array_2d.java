

import java.util.*;

public class Array_2d {

    // array input
    public static void cin(int arr[][]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("2D array input :-");

        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // array print function
    public static void cout(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;

        System.out.println("2D array output :-");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // spiral order printing of array
    public static void CirCout(int arr[][]) {

        int rnd = arr.length - 1;
        int cnd = arr[0].length - 1;
        int Rst = 0, Cst = 0;


        while (rnd >= Rst && cnd >= Cst) {

            // top
            for (int i = Cst; i <= cnd; i++) {
                System.out.print(arr[Cst][i] + " ");
            }
            Rst++;

            // System.out.println();

            // right
            for (int i = Rst; i <= rnd; i++) {
                System.out.print(arr[i][cnd] + " ");
            }
            cnd--;

            // System.out.println();

            // bottom
            for (int i = cnd; i >= Cst; i--) {
                System.out.print(arr[rnd][i] + " ");
            }
            rnd--;

            // System.out.println();

            // left
            for (int i = rnd; i >= Rst; i--) {
                System.out.print(arr[i][Cst] + " ");
            }
            Cst++;

            System.out.println();

        }
    }


    // Linear search in matrix
    public static void find(int arr[][],int n){
        
        int row = arr.length;
        int col = arr[0].length;

        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(n==arr[i][j]){
                    System.out.printf("%d found at %d %d \n",n,i,j);
                    return ;
                }
            }
        }
        System.out.println("value not found");
    }



    // staircase search in shorted array
    public static void StaircaseFind(int arr[][],int val){

        int row= arr.length;
        int col= arr[0].length;

        int i = 0;
        int j = col-1;

        while(i<row&&col>=0){
            if(arr[i][j]==val){
                System.out.println("value found at :"+i+" "+j);
                return;
            }
            else if(arr[i][j]>val){
                j--;
            }
            else{
                i++;
            }
        }
        
        System.out.println("value not found ");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num[][] = new int[4][3];

        int arr[][]={
                       {10,20,30,40},
                       {15,25,35,45},
                       {27,29,37,48},
                       {32,33,39,50}
                    };

        // cin(num);

        // cout(num);

        // CirCout(num);

        // find(arr,42);

        // StaircaseFind(arr, 15);

    }
}
