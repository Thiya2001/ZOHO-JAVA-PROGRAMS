public class ReversedArrayOfIntegerValues {
    public static void main(String[] args) {
        int a[] = {12, 43, 54, 33, 90};

        System.out.print("Reversed Array : ");
        for(int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}