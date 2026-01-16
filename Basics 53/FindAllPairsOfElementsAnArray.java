public class FindAllPairsOfElementsAnArray {
    public static void main(String[] args) {
        int a[] = {4, 7, 2, 0, 1, 6, 3, 5};
        int sum = 7;

        for(int i = 0; i < a.length; i++ ) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] + a[j] == sum) {
                    System.out.println(a[i] + " + " + a[j] + " = " + sum);
                }
            }
        }
    }
}
