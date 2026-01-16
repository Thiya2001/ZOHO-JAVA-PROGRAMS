public class RemoveSpecificElement {
    public static void main(String[] args) {
        int a[] = {93, 38, 23, 72, 69};
        int remove = 23;

        System.out.print("Array after removing : ");
        for(int i = 0; i < a.length; i++) {
            if(a[i] != remove) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
