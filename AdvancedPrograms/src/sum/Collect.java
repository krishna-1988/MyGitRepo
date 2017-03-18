package sum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sai Krishna on 06-06-2016.
 */
public class Collect {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(500);
        List<Integer> anotherList = new ArrayList<Integer>(list.size());
        for(int i=0;i<500;i++){
            list.add(i,i);
        }
        for(Integer i:list) {
            if(!list.containsAll(list)) {
                anotherList.add(i);
            }
        }
        System.out.println("The operation has completed successfully");
    }
}
