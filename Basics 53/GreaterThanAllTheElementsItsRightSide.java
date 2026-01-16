public class GreaterThanAllTheElementsItsRightSide {
    public static void main(String args[]) {
        int a[] = {16, 17, 4, 3, 5, 2};
        boolean b = true;
        
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    b = true;
                }
                else {
                    b = false;
                    break;
                }
            }
            if(b) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
