public class FindRotationCountRotatedSortedArray {
    public static void main(String args[]) {
        int a[] = {15, 18, 2, 3, 6, 12};
        int b = a[0];
        int count = 0;

        for(int i = 1; i < a.length; i++) {
            if(a[i] < b) {
                b = a[i];
                count = i;
            }
        }
        System.out.print("Rotation count = " + count);
    }
}
