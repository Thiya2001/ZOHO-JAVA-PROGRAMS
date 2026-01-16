public class InsertElementSpecificPositionArray {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int e = 25;
        int p = 2;

        System.out.print("Array after insertion : ");
        for(int i = 0; i <= a.length; i++) {
            if(i < p) {
                System.out.print(a[i] + " ");
            } else if(i == p) {
                System.out.print(e + " ");
            } else {
                System.out.print(a[i - 1] + " ");
            }
        }
    }
}
