package first;

import java.util.*;

/**
 * Created by Sai Krishna on 20-09-2016.
 */
public class CompareIt {
    public static void main(String[] args){

        //CompareIt compareIt = new CompareIt();
        int value  = 0;
        //value = compareIt.getIt("15.119.81.117","15.119.81.118");
        //System.out.println("The value is: "+value);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("15.119.81.45");
        arrayList.add("15.119.81.127");
        arrayList.add("15.119.81.123");
        arrayList.add("15.119.81.127");
        arrayList.add("15.19.82.40");
        arrayList.add("15.119.81.40");
        Collections.sort(arrayList);
        //Collections.sort();
        //Set<String> set = new HashSet<>(arrayList);
        for(String name: arrayList){
            System.out.println("The value is: "+name+" from ArrayList");
        }

        /*for(String name: set){
            System.out.println("The value is: "+name);
        }*/
       List<Integer> newList = CompareIt.mySort(arrayList);
        for(Integer name: newList){
            System.out.println("The value is: "+name+" from sorted");
        }


    }

    public int getIt(String a, String b) {
        return a.compareTo(b);
    }
    public static List<Integer> mySort(List<String> unsorted){
        //Integer[] firstInteger = new Integer[3];
        //Integer[] sortedInteger = new Integer[3];
        Integer sortedInteger = new Integer(0);
        String rawString = new String();
        String newValue = "";
        List<Integer> newList = new ArrayList<>(unsorted.size());
        List<String> newList1 = new ArrayList<>(unsorted.size());
        List<String> newList2 = new ArrayList<>(unsorted.size());
        List<String> newList3 = new ArrayList<>(unsorted.size());
        List<String> newList4 = new ArrayList<>(unsorted.size());
        for(String value: unsorted){
            rawString = value.replaceAll("\\.","");
            //newList.add(rawString);
            sortedInteger = Integer.parseInt(rawString);
            newList.add(sortedInteger);
            /*for(String str:rawString) {
                if(str.length() < 3) {
                    if(str.length() <2) {
                        str = "00".concat(str);
                    } else {
                        str = "0".concat(str);
                    }

                }
                newValue = newValue.concat(str);
                //System.out.println("3rd Place"+newValue);
            }
            newList.add(newValue);
            newValue = "";*/
        }
        Collections.sort(newList);

        return newList;
    }
    public static List<String> improvedSort(List<String> unsorted) {



        return unsorted;
    }
}
