import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class ex3Q9 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력

        HashSet<Integer> temp = new HashSet<>(numbers);
        System.out.println(temp);

        ArrayList<Integer> result = new ArrayList<>(temp);
        System.out.println(result);
    }
}