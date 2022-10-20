import java.util.HashSet;
import java.util.Arrays;

public class Ex_add {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
        set.remove("To");
        System.out.println(set);
    }
}
