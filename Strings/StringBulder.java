
// string bulder is same as string but al little differnce is 
// if we make any change in string then that string get copyed to another location with that change
// but in StringBulder they not get copyed and make addition at the same location


import java.util.*;

public class StringBulder {
    public static void main(String args[]){

        StringBuilder sb = new StringBuilder("");

        for(char i = 'a';i<='z';i++){
            sb.append(i);
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
