public class TheArrayOfIntegersWithout0AndMinus1 {
    public static void main(String args[]) {
        int a[] = {3, -1, 4, 6, 9};
        boolean b = false;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == 0 || a[i] == -1) {
                b = true;
            }
        }
        if(b) {
            System.out.println("Array contains 0 or -1");
        }
        else {
            System.out.println("Array Doesn't contains 0 or -1");
        }
    }
}
