public class Function {

    // Function for fibonachi
    public static void fibo(int n){
        int a=0,b=1,c;
        for(int i=0;i<n;i++){
            System.out.print(" "+a);
            c=a+b;
            a=b;
            b=c;
        }
    }

    // fucntion for factorial
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        return (n*Fact(n-1));
    }


    // function for inverted star pattern
    public static void invertStar(int n){
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(j<=i)
                System.out.print(" *");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }


    public static void pyOfZeroOne(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j>0;j--){
                System.out.print(" "+j%2);
            }
            System.out.println();
        }
    }

    // Rohombus pattern
    public static void rhombus(int n){
        for(int i=1;i<=n;i++){

            // for space
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            // for stars
            for(int j=1;j<=n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

        fibo(10);
        int n = Fact(7);
        System.out.println("\nfact of 7 is :"+n);

        invertStar(7);

        pyOfZeroOne(7);

        rhombus(7);
    }
}
