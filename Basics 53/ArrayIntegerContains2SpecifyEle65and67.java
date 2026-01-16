public class ArrayIntegerContains2SpecifyEle65and67 {
    public static void main(String args[]) {
        int a[] = {10, 65, 23, 77, 45};
        boolean b = false;
        boolean c =false;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == 65) {
                b = true;
            }
            else if(a[i] == 77) {
                c = true;
            }
        }
        if(b && c) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
