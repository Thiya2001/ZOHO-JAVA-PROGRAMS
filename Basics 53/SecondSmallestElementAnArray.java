public class SecondSmallestElementAnArray {
    public static void main(String[] args) {
        int a[] = {13, 54, 84, 78, 30, 77, 41};
        int fs = 100, ss = 100;

        if(a[0] < a[1]) {
            fs = a[0];
            ss = a[1];
        }
        else {
            fs = a[1];
            ss = a[0];
        }

        for(int i = 2; i < a.length; i++) {
            if(a[i] < fs) {
                ss = fs;
                fs = a[i];
            }
            else if(a[i] < ss) {
                ss = a[i];
            }
        }
        System.out.print("Second Smallest Elements Integer On Array : " + ss);
    }
}