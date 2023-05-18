
public class QString {

    // check the string is palindrom or not

    public static void isPalindrom(String str){
        byte chk = 1;
        for(byte i = 0; i<(str.length()/2);i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                chk=0;
            }
        }
        if(chk==1){
            System.out.println("given string is a palindrom");
        }else{
            System.out.println("given string is not a palindrom");

        }
    }

    // Q2. given rout contains 4 diraction(E W N S) find the shortest way to reach the destivation
    public static void getSortWay(String str){
        int x=0,y=0;
        for(int i = 0 ;i<str.length();i++){

            if(str.charAt(i)=='N'){  y++;  }
            else if(str.charAt(i)=='S'){  y--;  }
            else if(str.charAt(i)=='E'){  x++;  }
            else if(str.charAt(i)=='W'){  x--;  }            
        }

        int X2=x*x;
        int Y2=y*y;
        float ans = (float)Math.sqrt(X2+Y2);

        System.out.println("shortest path is :"+ans);
    }
    public static void main(String args[]) {

        String str = new String("reacer");

        // str.charAt(3);
        // str.equals("okg");
        // str.substring(1, 3);

        // lexicographic approch to compair 2 string
        // str.compareTo("another streing")

        isPalindrom(str);

        getSortWay("WNEENESENNN");

    }
}
