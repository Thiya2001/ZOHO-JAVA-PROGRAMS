public class Separate0sLeftSideAnd1sRightSideArray {
    public static void main(String args[]) {
        int a[] = {1, 0, 1, 0, 1, 0};

        String zero = "";
        String one = "";

        for(int i = 0; i < a.length; i++) {
            if(a[i] <= 0) {
                zero += a[i] + " ";
            }
            else {
                one += a[i] + " ";
            }
        }
        System.out.print(zero + one);
    }
}
