public class FindSumOf2EleOfArrayIsEqualToInteger {
    public static void main(String args[]) {
        int a[] = {1, 2, 4, 5, 6};
        int tarValue = 7;
        boolean b = false;
        
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] + a[j] == tarValue) {
                    b = true;
                    break;
                }
            }
            if(b)
                break;
        }
        System.out.println(b);
    }
}
