public class MoveAllZeroEndOrderOtherNonZeroArray {
    public static void main(String args[]) {
        int a[] = {4, 0, 5, 0, 0, 2, 1};

        for(int i = 0; i < a.length; i++) {
            if(a[i] != 0) {
                System.out.print(a[i] + " ");
            }
        }
        for(int j = 0; j < a.length; j++) {
            if(0 == a[j]) {
                System.out.print(a[j] + " ");
            }
        }
    }
}
