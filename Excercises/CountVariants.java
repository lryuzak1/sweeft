package Excercises;

public class CountVariants {
    public static int countVariants(int stairsCount) {
        if (stairsCount == 1) {
            return 1;
        }
        if (stairsCount == 2) {
            return 2;
        }
        return countVariants(stairsCount - 1) + countVariants(stairsCount - 2);
    }
}
