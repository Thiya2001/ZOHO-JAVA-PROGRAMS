public class RemoveDupEleAndReturnLengthOfArray {
    public static void main(String args[]) {
        int a[] = {20, 20, 30, 40, 50, 50, 50};
        int count = 0;

        for(int i = 0; i < a.length; i++) {
            boolean dup = false;
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] == a[j]) {
                    dup = true;
                    break;
                }
            }
            if(!dup) {
                count++;
            }
        }
        System.out.println(count);
    }
}
