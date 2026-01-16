public class FindSmallestAndSecondSmallestElements {
    public static void main(String args[]) {
        int a[] = {10, 20, 5, 8, 5};
        int fs = a[0], ss = 1;

        for(int i = 0; i < a.length; i++) {
            if(a[i] < fs) {
                ss = fs;
                fs = a[i];
            }
            else if(a[i] < ss && a[i] != fs) {
                ss = a[i];
            }
        }
        System.out.println("First Smallest is : " + fs);
        System.out.println("Second Smallest is : " + ss);
    }
}
