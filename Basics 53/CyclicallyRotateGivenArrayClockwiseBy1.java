public class CyclicallyRotateGivenArrayClockwiseBy1 {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};

        int b[] = new int[a.length];

        for(int i = 1; i < a.length; i++) {
            b[i] = a[i - 1];
            b[0] = a[a.length - 1];
        }
        for(int i = 0; i < a.length; i++)
            System.out.print(b[i] + " ");
    }
}
