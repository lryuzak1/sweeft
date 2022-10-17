package Excercises;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //palindrome
        String palindrome = "cacac";
        String notPalindrome = "abacd";
        System.out.println(palindrome + " is palindrome? " + IsPalindrome.isPalindrome(palindrome));
        System.out.println(notPalindrome + " is palindrome? " + IsPalindrome.isPalindrome(notPalindrome));

        //min split
        int totalMoney = 156;
        System.out.println("min split coins: " + MinSplit.minSplit(totalMoney));

        //min not contains in array
        int[] arr = {4, 3, -1, -2, 5, 3, 6};
        System.out.println("min positive number not in array: " + NotContains.notContains(arr));

        //bracket sequence
        String sequence = "()(())()";
        System.out.println(sequence + " is proper sequence? " + IsProperly.isProperly(sequence));

        //total variants for stairs
        int totalStairs = 4;
        System.out.println(totalStairs + "-stair variants=" + CountVariants.countVariants(totalStairs));

        //data structure
        DataStructure ds=new DataStructure();

        ds.add(1);
        ds.add(2);
        ds.add(3);
        ds.add(4);
        ds.add(5);
        ds.remove(3);

    }

}
