import java.util.*;

public class Loop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        
        int k = 10;
        // while loop
        while (k < 52) {
            System.out.println("value is :" + k);
            k = k + 5;

        }




        // do while loop
        int j;
        do {
            j = sc.nextInt();
            System.out.println("j is :" + j);
        } while (j > 100);




        // for loop

        for (int i = 0; i < 9; i++) {
            System.out.println("this is :" + i * i);
        }



        // pyramid in java
        int n = 6;
        int ch = 'A';

        for (int i = 0; i < n; i++) {
            for (int l = 0; l < i; l++) {
                System.out.print((char)ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}