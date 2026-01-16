public class FindDuplicateValuesOfArrayOfString {
    public static void main(String[] args) {
        String str[] = {"apple", "banana", "Mango", "banana", "apple"};

        System.out.print("Duplicate of String Array : ");
        for(int i = 0; i < str.length; i++) {
            for(int j = i + 1; j < str.length; j++) {
                if(str[i] == str[j]) {
                    System.out.print(str[i] + " ");
                }
            }
        }
    }
}
