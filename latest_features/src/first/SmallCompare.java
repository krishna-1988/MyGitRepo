package first;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Sai Krishna on 21-09-2016.
 */
public class SmallCompare {
    public static void main(String[] args) {

        //CompareIt compareIt = new CompareIt();
        int value = 0;
        //value = compareIt.getIt("15.119.81.117","15.119.81.118");
        //System.out.println("The value is: "+value);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("45");
        arrayList.add("23");
        arrayList.add("127");
        arrayList.add("40");
        Collections.sort(arrayList);
        for(String name: arrayList){
            System.out.println("The value is: "+name+" from ArrayList");
        }

        long values = 1;
        for(int i=0;i<4;i++){
            values*=256;
        }
        //int k = 4294967296;
        System.out.println(values);


    }
}
