public class SeparateEvenAndOddNoOfArrayIntegers {
    public static void main(String args[]) {
        int a[] = {12, 7, 5, 3, 8, 10, 9};

        String even = "";
        String odd = "";

        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                even += a[i] + " ";
            }
            else {
                odd += a[i] + " ";
            }
        }
        System.out.print(even + odd);
    }
}
