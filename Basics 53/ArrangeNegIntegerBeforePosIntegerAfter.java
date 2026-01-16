public class ArrangeNegIntegerBeforePosIntegerAfter {
    public static void main(String args[]) {
        int a[] = {12, -7, -5, 3, -1, 8, 0};
        int b[] = new int[a.length];
        int c = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] < 0) {
                b[c] = a[i];
                c++;
            }
        }
        for(int i = 0; i < a.length; i++) {
            if(a[i] >= 0) {
                b[c] = a[i];
                c++;
            }
        }
        System.out.print("Rearranged Array : ");
        for(int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
