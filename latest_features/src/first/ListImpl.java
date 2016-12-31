package first;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sai Krishna on 31-12-2016.
 */
public class ListImpl {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        for(int i=0; i< numbers.size(); i++){
            System.out.println("The value at "+ i +" is: "+ numbers.get(i));
        }
    }
}
