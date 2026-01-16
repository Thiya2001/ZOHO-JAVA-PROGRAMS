import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        String a[] = {"apple", "banana", "orange", "grape"};
        
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < a.length; i++)
            list.add(a[i]);
        System.out.println("ArrayList values : " + list);
    }
}
