public class SecondLargestElementAnArray {
    public static void main(String[] args) {
        int a[] = {13, 54, 84, 78, 30, 77, 41};
        int fl = 1, sl = 1;

        System.out.print("Second Largest Elements Integer On Array : ");
        for(int i = 0; i < a.length; i++) {
            if(a[i] > fl) {
                sl = fl;
                fl = a[i];
            }
            else if(a[i] > sl) {
                sl = a[i];
            }
        }
        System.out.print(sl);
    }
}
