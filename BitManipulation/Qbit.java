public class Qbit {

    
    // Function to get bit on given i'th postion
    public static void getBit(int n, int i) {
        int cmp = 1 << i;

        if ((cmp & n) == 0) {
            System.out.printf("Bit is 0\n");
        } else {
            System.out.printf("Bit is 1\n");
        }
    }

    // Function to set bit on given i'th postion
    public static void setBit(int n, int i) {
        int cmp = 1 << i;

        n = cmp | n;
        System.out.printf("new value after set bit : %d\n", n);
    }

    // Function to clear bit on given i'th postion
    public static void clearBit(int n, int i) {
        int cmp = 1 << i;

        cmp = ~cmp;

        n = cmp & n;
        System.out.printf("new value after clear bit : %d\n", n);
    }

    // Function to update the giben bit
    public static void updateBit(int n, int i, int bit) {

        if (bit == 0) {
            clearBit(n, i);
        } else {
            setBit(n, i);
        }
    }

    // Function to clear last i'th bits
    public static int clearIthBit(int n, int i) {
        int cmp = -1 << i;
        n = n & cmp;
        System.out.printf("Value after clearing last %d bits :%d\n", i, n);

        return n;
    }

    // Function to clear range of bits
    public static void clearBitRange(int n, int stInd, int endInd) {
        int end = -1 << endInd;
        int st = ~(-1 << stInd);

        int bitMass = end | st;

        n = bitMass & n;

        System.out.printf("value after clearing rang from %d to %d is :%d\n", stInd, endInd, n);

    }

    public static void main(String args[]) {


        getBit(5, 2);

        setBit(5, 1);

        clearBit(5, 2);

        updateBit(6, 4, 1);

        clearIthBit(11, 2);

        clearBitRange(23, 1, 3);

    }
}