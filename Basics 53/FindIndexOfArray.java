public class FindIndexOfArray {
    public static void main(String[] args) {
        int a[] = {34, 67, 92, 48, 83};
        int search = 48;
        boolean found = false;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == search) {
                System.out.println("Index of specific value " + search + " is : " + i);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Array does not contain specific value : " + search);
        }
    }
}
