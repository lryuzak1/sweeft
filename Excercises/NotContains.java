package Excercises;

import java.util.Arrays;

public class NotContains {
    public static int notContains(int[] array) {
        int res=1;
        Arrays.sort(array);
        for (int i = 0; i < array.length ; i++) {
            if(array[i]==res){
                res++;
            }
        }
        return res;
    }
}
