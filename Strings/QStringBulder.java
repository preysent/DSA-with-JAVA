
import java.util.*;

public class QStringBulder {

    // convert each char of the string to uppercase
    public static void toUpperCase(String str) {

        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {

            if((str.charAt(i-1)==' ')&&(str.charAt(i)!=' ')){
                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }
            else
            sb.append(str.charAt(i));
        }

        System.out.println(sb);

    }

    public static void main(String args[]) {
        toUpperCase("hello preysent This is praveen your friend ");
    }
}
