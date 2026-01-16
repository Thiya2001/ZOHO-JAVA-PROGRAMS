public class AverageValuesAnArray {
    public static void main(String[] args) {
        int a[] = {70, 80, 60, 90, 50};
        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            sum += a[i];
            }
        System.out.println("Average of array values : " + sum / a.length);
    }
}
