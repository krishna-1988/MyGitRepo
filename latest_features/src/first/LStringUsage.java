package first;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sai Krishna on 10-09-2016.
 */
public class LStringUsage {
    public static void main(String[] args){
        List<String> string = Arrays.asList("Str","str","STR");
        String str = "str";
        string.forEach((String value) -> System.out.println(value) );
        for(String value : string) {
            if (value.equalsIgnoreCase(str)) {
                System.out.println("Value is same");
            }
        }
    }

    @Override
    public boolean equals(Object obj){
        System.out.println("Current Class");
        return false;
    }

}
