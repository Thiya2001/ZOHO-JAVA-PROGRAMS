public class CountNoOfPossibleTrianglesPositiveIntegers {
    public static void main(String args[]) {
        int a[] = {4, 6, 3, 7};
        int count = 0;

        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0; i < a.length - 2; i++) {
            for(int j = i + 1; j < a.length - 1; j++) {
                for(int k = j + 1; k < a.length; k++) {
                    if(a[i] + a[j] > a[k]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
