public class FindAllUniqueTripletsSumOf3Element {
    public static void main(String args[]) {
        int a[] = {1, -2, 0, 5, -1, -4};
        int tarValue = 2;

        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        System.out.println("Triplets whose sum is 2 : ");
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1 ; j < a.length; j++) {
                for(int k = j + 1; k < a.length; k++) {
                    if(a[i] + a[j] + a[k] == tarValue) {
                        System.out.println(" [" + a[i] + " + " + a[j] + " + " + a[k] + "] ");
                    }
                }
            }
        }
    }
}
