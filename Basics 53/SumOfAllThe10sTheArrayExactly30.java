public class SumOfAllThe10sTheArrayExactly30 {
    public static void main(String[] args) {
        int a[] = {10, 5, 10, 20, 0, 10};
        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == 10) {
                sum += a[i];
            }
        }
        if(sum == 30) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }  
    } 
}
