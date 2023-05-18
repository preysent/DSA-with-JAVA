
// Q. rain water storing quation

import java.util.*;



public class ArrayQ1 {

      // print Array
      public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }


    public static void main(String args[]){

        int arr[]={4,2,0,6,3,2,5};
        // int arr[]={4,5};

        int leftMx[]=new int[arr.length];
        int rightMx[]=new int[arr.length];

        int mxl=Integer.MIN_VALUE;
        int mxr=Integer.MIN_VALUE;

        int water=0;


        for(int i=0;i<arr.length;i++){
            mxl=Math.max(mxl,arr[i]);
            mxr=Math.max(mxr,arr[arr.length-1-i]);

            leftMx[i]=mxl;
            rightMx[arr.length-1-i]=mxr;            
        }

        for(int i=0;i<arr.length;i++){
            int mn=Math.min(leftMx[i], rightMx[i]);

            water+=mn-arr[i];
        }

        System.out.println("total traped water is :"+water);


        

    }
}
