public class SumOf2ElePosAndNegCloseToZero {
    public static void main(String args[]) {
        int a[] = {1, 60, -10, 70, -80, 85};
        int max = a[0];
        int x = 0, y = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }

        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                int sum = a[i] + a[j];

                int positiveSum;
            
                if(sum < 0)
                    positiveSum = -sum;
                else
                    positiveSum = sum;


                if(positiveSum < max) {
                    max = positiveSum;
                    x = a[i];
                    y = a[j];
                }
            }
        }
        System.out.println("Sum Of 2 Element Positive and Negative Close To Zero : ");
        System.out.println(x + " and " + y); 
    }
}
