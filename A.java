import java.util.Arrays;

public class MainMethodDemo {

    /** Actual main method with String[] args**/
    public static void main(String[] args) {
        System.out.println("String[] args main method called");
        main(new Double[] {
            1.0,
            2.0,
            3.0
        });
    }

    /** Overloaded main method with Double[] args**/
    public static void main(Double[] args) {
        System.out.println("Double[] args main method called");
        System.out.println(Arrays.toString(args));
    }
}
