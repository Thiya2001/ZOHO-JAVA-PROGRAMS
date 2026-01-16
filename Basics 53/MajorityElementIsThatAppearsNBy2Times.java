public class MajorityElementIsThatAppearsNBy2Times {
    public static void main(String args[]) {
        int a[] = {2, 2, 1, 2, 3, 2, 2, 4};
        int b = a.length / 2;
        boolean f = false;
        
        for(int i = 0; i < a.length; i++) {
            int count = 0;
            for(int j = 0; j < a.length; j++) {
                if(a[i] == a[j]) {
                    count++;
                }
            }
            if(count > b) {
                System.out.println(a[i]);
                f = true;
                break;
            }
        }
        if(!f) {
            System.out.println("No majority element");
        }
    }
}
