public class SortNumericArray {
    public static void main(String[] args) {
        int a[] = {5, 2, 8, 1, 3};
        String s[] = {"banana", "apple", "orange", "mango", "grape"};

        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0; i < s.length; i++) {
            for(int j = i + 1; j < s.length; j++) {
                if(s[i].compareTo(s[j]) > 0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        System.out.print("Sorted numeric array : ");
        for(int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Sorted string array : ");
        for(String str : s) {
            System.out.print(str + " ");
        }
    }
}