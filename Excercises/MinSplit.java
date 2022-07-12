package Excercises;

public class MinSplit {
    public static int minSplit(int amount) {
        int totalCoins = 0;

        //1a+5b+10c+20d+50e=amount
        //a+b+c+d+e->min
        while (amount > 0) {
            if (amount >= 50) {
                totalCoins++;
                amount -= 50;
            } else if (amount >= 20) {
                totalCoins++;
                amount -= 20;
            } else if (amount >= 10) {
                totalCoins++;
                amount -= 10;
            } else if (amount >= 5) {
                totalCoins++;
                amount -= 5;
            } else {
                totalCoins++;
                amount -= 1;
            }
        }
        return totalCoins;
    }
}
