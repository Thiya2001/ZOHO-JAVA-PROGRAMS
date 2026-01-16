public class FindCommonBetween2ArraysOnInteger {
    public static void main(String[] args) {
        int a[] = {13, 54, 91, 30, 77};
        int b[] = {93, 44, 80, 11, 54};

        System.out.print("Common Two Integer On Array : ");
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}
