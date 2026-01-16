public class SumOfGivenSortedAndRotatedArray {
    public static void main(String args[]) {
        int a[] = {4, 5, 6, 7, 1, 2};
        int sum = 10;
        boolean b = false;

        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] + a[j] == sum)
                b = true;
            }
        }
        if(b)
            System.out.println("Yes pair exists");
        else
            System.out.println("No pair does not exist");
    }
}
