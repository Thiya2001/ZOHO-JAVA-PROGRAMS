public class LargestAndSmallestValuesArrayOfIntegers {
    public static void main(String args[]) {
        int a[] = {10, 5, 25, 3, 18};
        int l = a[0], s = a[0];

        for(int i = 0; i < a.length; i++) {
            if(a[i] > l) {
                l = a[i];
            }
            else if(a[i] < s) {
                s = a[i];
            }
        }
        System.out.print("Difference between Largest and Smallest values in an array of integers : " + (l - s));
    }
}
