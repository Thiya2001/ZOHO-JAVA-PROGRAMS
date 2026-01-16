public class SumValuesAnArray {
    public static void main(String[] args) {
        int a[] = {39, 78, 23, 45, 61};
        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Sum of array values: " + sum);
    }
}
