package Excercises;

import java.util.*;

public class DataStructure {
    //key:number
    //value: index of that number in data array
    private Map<Integer, Integer> numberIndexes;
    //numbers
    private List<Integer> data;

    public DataStructure() {
        numberIndexes = new HashMap<>();
        data = new ArrayList<>();
    }

    public boolean add(Integer num) {
        if (numberIndexes.containsKey(num)) {
            return false;
        } else {
            data.add(num);
            numberIndexes.put(num, data.size() - 1);
            return true;
        }
    }

    public boolean remove(Integer num) {
        if (!numberIndexes.containsKey(num)) {
            return false;
        } else {
            //get number index and array last index
            int numIndex = numberIndexes.get(num);
            int lastIndex = data.size() - 1;

            //if they are the same its O(1) delete from last index from arraylist(no shifting needed) also from map
            if (numIndex == lastIndex) {
                data.remove(numIndex);
                numberIndexes.remove(num);
            } else {
                //if they are different swap this number and last
                Collections.swap(data, numIndex, lastIndex);
                //then remove last
                data.remove(lastIndex);
                numberIndexes.remove(num);

                //and set previous last number's new index into map
                numberIndexes.replace(data.get(numIndex), numIndex);
            }
            return true;
        }

    }
}
