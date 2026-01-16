import java.util.ArrayList;
public class ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(93);
        al.add(31);
        al.add(44);
        al.add(82);
        al.add(77);

        int a[] = new int[al.size()];

        for(int i = 0; i < al.size(); i++) {
            a[i] = al.get(i);
        }
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
