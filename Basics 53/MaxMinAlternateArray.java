public class MaxMinAlternateArray {
    public static void main(String args[]) {
        int a[] = {50, 10, 30, 70, 40, 60, 20};

        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp; 
                }
            }
        }
        int left = 0;
        int right = a.length - 1;
        System.out.print("Required Output : ");
        
        while(right >= left) {
            if(right != left) {
                System.out.print(a[right] + " ");
                System.out.print(a[left] + " ");
            }
            else {
                System.out.print(a[right] + " ");
            }
            left++;
            right--;
        }
    }
}
