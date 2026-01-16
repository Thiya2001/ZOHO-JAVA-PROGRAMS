public class ReplaceEveryEleNextGreatestEleRightSide {
    public static void main(String args[]) {
        int a[] = {16, 17, 4, 3, 5, 2};

        for(int i = 0; i < a.length; i++) {
            int max = -1;
            for(int j = i + 1; j < a.length; j++) {
                if(max < a[j]) {
                    max = a[j];
                }
            }
            System.out.print(max + " ");
        }
    }
}
