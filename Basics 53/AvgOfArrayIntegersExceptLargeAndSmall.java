public class AvgOfArrayIntegersExceptLargeAndSmall {
    public static void main(String args[]) {
        int a[] = {11, 8, 25, 7, 16, 17};
        int l = a[0], s = a[0], sum = 0;

        for(int i = 0; i < a.length; i++) {
            sum += a[i];

            if(a[i] > l) {
                l = a[i];
            }
            if(a[i] < s) {
                s = a[i];
            }
        }
        int avg = sum - l - s;
        System.out.print(avg / (a.length - 2));
    }
}
