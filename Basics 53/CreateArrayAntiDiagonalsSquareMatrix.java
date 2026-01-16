public class CreateArrayAntiDiagonalsSquareMatrix {
    public static void main(String args[]) {
        int a[][] = {
            {1, 2},
            {3, 4}
        };

        for(int sum = 0; sum <= 2* a.length - 2; sum++) {
            System.out.print("[");
            boolean b = true;
            for(int i = 0; i < a.length; i++) {
                for(int j = 0; j < a.length; j++) {
                    if(i + j == sum) {
                        if(!b) {
                            System.out.print(", ");
                        }
                        System.out.print(a[i][j]);
                        b = false;
                    }
                }
            }
            System.out.println("]");
        }
    }
}
