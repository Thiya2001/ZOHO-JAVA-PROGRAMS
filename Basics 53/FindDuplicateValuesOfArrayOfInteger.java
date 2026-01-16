public class FindDuplicateValuesOfArrayOfInteger {
    public static void main(String[] args) {
        int a[] = {5, 4, 0, 4, 1, 0, 2};

        System.out.print("Duplicate Values of Integer Array : ");
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] == a[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}