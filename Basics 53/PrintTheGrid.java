public class PrintTheGrid {
    public static void main(String[] args) {
        int r = 10;
        int c = 10;

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
