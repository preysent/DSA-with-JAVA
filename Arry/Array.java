
import java.util.*;

public class Array {


    // print Array
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }


    // linear search
    public static int Lsearch(int arr[],int value){
        for(int i=0;i<arr.length;i++){
            if(value==arr[i])
            return i;
        }
        return -1;
    }


    // find largest in arrey
    public static int Flargest(int arr[]){
        int res= Integer.MIN_VALUE;          //--------------------------min value
        for(int i=0;i<arr.length;i++){
            res=Math.max(res,arr[i]);
        }
        return res;
    }


    // binary search
    public static int BinSearch(int arr[],int value){

        int mn=0;
        int mx=arr.length;
        int md,res=-1;

        while(mn<=mx){
            md=(mn+mx)/2;

            if(arr[md]==value){
                res=md;
                break;
            }
            else if(arr[md]>value){
                mx=md-1;
            }
            else{
                mn=md+1;
            }
        }
        return res;
    }
    
    // Reverse an array
    public static void Rev(int arr[]){

        int start=0,end=arr.length-1,tmp;
        while(start<end){
            tmp=arr[start];
            arr[start]=arr[end];
            arr[end]=tmp;
            start++;
            end--;
        }
    }


    // pair of an array
    public static void pair(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print(" ("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }


    // All subArray print
    public static void subArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                
                System.out.print("(");
                for(int k=i;k<=j;k++){
                    System.out.print(" "+arr[k]+" ");
                }                
                System.out.print(") ");
            }
            System.out.println();
        }
        
    }

    // Max and Min sum subarray
    public static void MxMnSubArray(int arr[]){
        int mx=Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        int pvalue = 0 ;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){                
                for(int k=i;k<=j;k++){
                    pvalue+=arr[k];
                } 
                mx= Math.max(pvalue,mx);
                mn= Math.min(mn,pvalue);             
                pvalue=0; 
            }
        }
        System.out.println("max is :"+mx+"\n min is :"+mn); 
    }

    // Max sum subarray
    public static void mxSubArray(int arr[]){
        int prifixArray[]= new int[arr.length+1];
        int sum=0;
        prifixArray[0]=0;

        for(int i=1;i<=arr.length;i++){
            sum+=arr[i-1];
            prifixArray[i]=sum;                       

        }
        int Msum=Integer.MIN_VALUE;
        sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=prifixArray[j+1]-prifixArray[i];
                Msum=Math.max(sum, Msum);
            }
        }

        System.out.println("max sum is :"+Msum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // creation of array
        int arr[] = new int[4];
        int ar[]= {5013,5008,5041,5035,5026,5034};
        int sortedArr[]={2,8,512,653,1002};

        // input array
        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter value for " + i + " :");
            arr[i] = sc.nextInt();
        }
         */
        
        // Array print function
        // printArr(arr);

        int p= Lsearch(ar,5035);
        System.out.println("prostion of 5035 is :"+p);

        int larg = Flargest(ar);
        System.out.println("the largest number in arr is :"+larg);


       int bin=BinSearch(sortedArr,653);
        System.out.println("binary postion is "+bin);

        // printArr(ar);
        // Rev(ar);
        // printArr(ar);

        // pair(ar);

        // subArray(sortedArr);

        int mxar[]={24,-6,5,-25,15,-10};
        // MxMnSubArray(mxar);

        mxSubArray(mxar);
    }
}
