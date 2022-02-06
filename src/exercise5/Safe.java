package exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Safe {
    private static  Item[] items;
    private static int[][] dp;
    private static List<Integer> answer = new ArrayList<>();
    public static void answerRecovery(int i, int j){
        if (dp[i][j]==0){
            return;
        }
        if(dp[i-1][j]==dp[i][j]){
            answerRecovery(i-1, j);
        }
        else{
            answerRecovery(i-1,j-items[i].getVolume());
            answer.add(i);
        }
    }

    public static void dynamics (int n, int k) {
        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= k; ++j) {
                if(j > items[i].getVolume()) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - items[i].getVolume()] + items[i].getCost());
                }
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        items = new Item[n + 1];
        dp = new int[n + 1][k + 1];
        for (int i = 0; i < n; ++i) {
            int volume = scanner.nextInt();
            int cost = scanner.nextInt();
            items[i + 1] = new Item(volume, cost);
        }
        dynamics(n, k);
        answerRecovery(n, k);
        for (Integer item : answer) {
            System.out.println(item);
        }
    }

}
