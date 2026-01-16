public class FindNumberOfEvenAndOddIntegers {
    public static void main(String args[]) {
        int a[] = {34, 58, 65, 21, 92, 45};
        int count = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                count++;
            }
        }
        System.out.print("Even Count : " + count);
        System.out.println();

        int oc = a.length - count;
        System.out.print("Odd Count : " + oc);
    }
}
