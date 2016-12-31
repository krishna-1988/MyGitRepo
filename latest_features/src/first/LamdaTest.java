package first;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sai Krishna on 10-09-2016.
 */
public class LamdaTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        numbers.forEach((Integer value) -> System.out.println(value));
    }
}
