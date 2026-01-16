public class FindCommonBetween2ArraysOnString {
    public static void main(String[] args) {
        String str1[] = {"apple", "Mango", "banana", "Kiwi"};
        String str2[] = {"banana", "Kiwi", "Grape", "Orange"};

        System.out.print("Common Two String On Array : ");
        for(int i = 0; i < str1.length; i++) {
            for(int j = 0; j < str2.length; j++) {
                if(str1[i] == str2[j]) {
                    System.out.print(str1[i] + " ");
                }
            }
        }
    }
}