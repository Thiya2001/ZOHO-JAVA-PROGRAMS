public class MaxAndMinValueOfArray {
    public static void main(String[] args) {
        int a[] = {45, 78, 12, 89, 23};
        int max = a[0];
        int min = a[0];

        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
            else if(a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }
}
