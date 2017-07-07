package sports;

/**
 * Created by WLP on 2017/7/4.
 */
public class Bicycle {

    String d;
    String color ="red";
    private void p(String color){
        color = "pur";
        System.out.println(color);
    }

    static short f;
    private static boolean w=true;

    public static void main(String[] args) {
        int i=0,s=0;
        do {
            if (i%2==0){
                i++;continue;
            }
            i++;s=s+i;
        }while (i<7);
        System.out.println(s);
    }
}
