public class QnaBit {

        // Q1. Function to find the Even and Odd
        public static void EorO(int n) {
            int comp = 1 & n;

            if (comp == 1) {
                System.out.printf("given number %d is odd\n", n);
            } else {
                System.out.printf("given number %d is even\n", n);
            }
        }

        // Q2. Find the number is power of two or not
        // we use & if the number is power of two then & of (n & n-1) is zero
        public static void PowerOf2(int n) {
            int m= n&(n-1);
            if ( m == 0) {
                System.out.printf("%d is power of two\n",n);
            }
        }


        //Q3. count the no. of 1 in a number
        public static void countSetBit(int n){
            int count = 0;
            int num=n;
            while(num>0){
                if((num&1)==1)
                      count++;
                num=num>>1;
            }
            System.out.printf("no of set bit in %d is %d\n",n,count);
        }


        // Q4. Fint the Exponiantion (power) of given value
        public static void Expo(int n, int pow){

            // inetial value of ans is one becose pover of any int value cannot be less then 1
            int ans = 1;

            // we use the bit's to power for loop
            while(pow>0){
                
                // now last bit of pow
                int lb=pow&1;

                if(lb==1){
                    ans*=n;
                }
                // updating value of n with postion of bits
                n*=n;

                pow=pow>>1;

            }

            System.out.printf("Exponent is :%d\n",ans);

        }

        public static void main(String args[]) {

            EorO(41);

            PowerOf2(8);

            countSetBit(11);

            Expo(5, 3);
        
    }
}
