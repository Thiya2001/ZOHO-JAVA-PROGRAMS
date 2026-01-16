public class CopyAnArray {
    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50};
        int copy[] = new int[a.length];

        for(int i = 0; i < a.length; i++) {
            copy[i] = a[i];
        }
        System.out.print("Copied Array: ");
        for(int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
