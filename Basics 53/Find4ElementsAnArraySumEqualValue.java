public class Find4ElementsAnArraySumEqualValue {
    public static void main(String args[]) {
        int a[] = {1, 0, -1, 0, -2, 2};
        int target = 0;

        System.out.println("Combinations whose sum = " + target + " : ");
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                for(int k = j + 1; k < a.length; k++) {
                    for(int l = k + 1; l < a.length; l++) {
                        if(a[i] + a[j] + a[k] + a[l] == target) {
                            System.out.println("[" + a[i] + ", " + a[j] + ", " + a[k] + ", " +  a[l] + "]");
                        }
                    }
                }
            }
        }
    }
}
