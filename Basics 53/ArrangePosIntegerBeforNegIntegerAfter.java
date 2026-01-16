public class ArrangePosIntegerBeforNegIntegerAfter {
    public static void main(String args[]) {
        int a[] = {-2, 4, -6, 7, -1, 5};

        String pos = "";
        String neg = "";

        for(int i = 0; i < a.length; i++) {
            if(a[i] > 0) {
                pos += a[i] + " ";
            }
            else {
                neg += a[i] + " ";
            }
        }
        System.out.print(pos + neg);
    }
}
