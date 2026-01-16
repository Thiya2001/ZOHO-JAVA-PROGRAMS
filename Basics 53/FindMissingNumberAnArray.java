public class FindMissingNumberAnArray {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 5, 6, 7};

        for(int i = 0; i < a.length; i++) {
            if(a[i + 1] != a[i] + 1) {
                System.out.print("Missing Number is : " + (a[i] + 1));
                break;
            }
        }
    }
}
