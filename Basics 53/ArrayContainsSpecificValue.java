public class ArrayContainsSpecificValue {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int search = 30;
        boolean found = false;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == search) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("Array contains specific value : " + search);
        } else {
            System.out.println("Array does not contain specific value : " + search);
        }
    }
}
