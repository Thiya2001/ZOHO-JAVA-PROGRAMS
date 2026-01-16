public class FindLengthOfLongestConsecutiveEle {
    public static void main(String args[]) {
        int a[] = {49, 1, 3, 200, 2, 4, 70, 5};
        int currentCount = 1;
        int maxCount = 1;

        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 1; i < a.length; i++) {
            if(a[i] == a[i - 1]) {
                continue;
            }
            else if(a[i] == a[i - 1] + 1) {
                currentCount++;
            }
            else {
                currentCount = 1;
            }
            if(currentCount > maxCount) {
                maxCount = currentCount;
            }
        }
        System.out.println(maxCount);
    }
}
