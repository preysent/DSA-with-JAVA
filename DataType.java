
import java.util.*;  //importing all utility 


public class DataType{
    public static void main(String args[]){

        // byte store integar from -128 to 128
        byte bt= 127;
        System.out.println(bt);

        char ch = 'p';
        boolean bl = false;
        int i = 725;
        float price = (float)10.5;
        long ln =45454838;
        double dbl=53.211868;
        short srt = 254;

// --------------------------------------------------------------------------

        Scanner sc = new Scanner(System.in); //creating scanner object
        i = sc.nextInt();

        System.out.println(i);


// ----------------------------------------------------------------------------

        System.out.print("Enter two value for sum ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.print(a+b);

// ----------------------------------------------------------------------------

// * type convertion
/*
       convertion automatically happends in java when 
       a. type compatible
       b. destination type > source type

       eg.
            byte -> short -> int -> float -> long -> double

*/
    }
}