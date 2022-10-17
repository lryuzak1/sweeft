package Excercises;

public class IsProperly {
    public static boolean isProperly(String sequence) {
        int tmp = 0;
        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) == '(') {
                tmp++;
            } else if (sequence.charAt(i) == ')') {
                tmp--;
            }
            if (tmp < 0) {
                return false;
            }
        }
        return tmp == 0;
    }
}
