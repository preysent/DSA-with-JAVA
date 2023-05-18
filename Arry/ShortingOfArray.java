
import java.util.*;

public class ShortingOfArray {

    // print Array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    // Bubble short
    public static void BubbleShort(int arr[]) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {

            for (int j = 0; j < len - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        // printArr(arr);
    }

    // Selection Short
    public static void SelectionShort(int arr[]) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {

            int minPos = i;

            for (int j = i + 1; j < len; j++) {
                if (arr[minPos] > arr[j])
                    minPos = j;
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }

        // printArr(arr);
    }

    // merge sort
    public static void mergeSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        int md = (si + ei) / 2;

        mergeSort(arr, si, md);
        mergeSort(arr, md + 1, ei);

        int ar[] = new int[ei-si+1];
        int l =si,r=md+1,i=0;

        while(l<=md&&r<=ei){
            if(arr[l]>arr[r]){
                ar[i]=arr[r];
                r++;
            }
            else{
                ar[i]=arr[l];
                l++;
            }
            i++;
        }

        while(l<=md){
            ar[i++]=arr[l++];
        }

        while(r<=ei){
            ar[i++]=arr[r++];
        }

        for(int j = si, k=0; j<=ei;j++,k++){
            arr[j]=ar[k];
        }       
        return;
    }




    // quick sort
    public static void quickSort(int arr[], int si, int ei) {

        if(si>=ei){
            return;
        }

        int pevit = arr[ei];
        int i = si-1;
        int j ;

        for(j=si;j<ei;j++){
            if(arr[j]<pevit){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }

        i++;
        int temp = arr[ei];
        arr[ei]=arr[i];
        arr[i]=temp;

        quickSort(arr, si, i-1);        
        quickSort(arr, i+1, ei);


    }




    // search in rototed sorted Array
    public static int findInd( int arr[],int si, int ei, int valueToFind){

        if(si >= ei){
            return -1;
        }
        
        int res=-1,  avg = si+((ei-si)/2);
        
        if(arr[avg]==valueToFind){
            res = avg;
        }else if (arr[si]==valueToFind){
            res=si;
        }else if (arr[ei]==valueToFind){
            res=ei;
        }
     
        else if(arr[si]<=arr[avg]){

            if( arr[si]<valueToFind && valueToFind<arr[avg] ){
                res= findInd(arr, si, avg, valueToFind);
            }
            else{
                res = findInd(arr, avg, ei, valueToFind);
            }
        }

        else if(arr[ei]>=arr[avg]){

            if( arr[ei]>valueToFind && valueToFind>arr[avg] ){
                res= findInd(arr, avg, ei, valueToFind);
            }
            else{
                res = findInd(arr,si, avg, valueToFind);
            }
        }



        return res;
    }


    public static void main(String args[]) {
        int arr[] = { 4, 6, 9,4,24,63,3,74,24,36, 7, 3, 16 };
        int sorAr[]= {5,6,7,8,9,0,1,2,3};

        // BubbleShort(arr);

        // SelectionShort(arr);

        // mergeSort(arr, 0, arr.length - 1);

        quickSort(arr, 0, arr.length-1);

        // inbult arr shorting function
        // Arrays.sort(arr);
        printArr(arr);
        // printArr(ans);

        System.out.println("the index of : "+findInd(sorAr, 0, sorAr.length-1, 3));
    }

}
