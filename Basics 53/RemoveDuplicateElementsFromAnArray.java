public class RemoveDuplicateElementsFromAnArray {
    public static void main(String[] args) {
        int a[] = {13, 54, 91, 13, 30, 77, 91};

        System.out.print("Remove Duplicate Elements Integer On Array : ");
        for(int i = 0; i < a.length; i++) {
        boolean isDup = false;
            for(int j = 0; j < i; j++) {
                if(a[i] == a[j]) {
                    isDup = true;
                    break;
                }
            }
            if(!isDup)
            System.out.print(a[i] + " ");
        }
    }
}