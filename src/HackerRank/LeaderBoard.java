package HackerRank;

import java.util.Scanner;

public class LeaderBoard {
    int[] rank;
    int[] player;

    public LeaderBoard(int[] rank, int[] player) {
        this.rank = rank;
        this.player = player;
    }

    public static int getRank(int[] rank, int number) {
        int[] newRank = new int[rank.length + 1];
        int index = 1;
        int rankPlayer = 0;
        for (int i = 0; i < rank.length - 1; i++) {
            if (rank[i] < rank[i + 1]) {
                int temp = rank[i];
                rank[i] = rank[i + 1];
                rank[i + 1] = temp;
                i = (i == 0) ? 0 : i-2;
            }
        }
        newRank[0] = 1;
        for (int i = 0; i < rank.length - 1; i++) {
            if (rank[i] > rank[i + 1]) {
                index++;
            }
            newRank[i + 1] = index;
        }
        newRank[rank.length] = newRank[rank.length - 1] + 1;
        while (rankPlayer < rank.length) {
            if (rank[rankPlayer] <= number) {
                break;
            }
            rankPlayer++;
        }
        return newRank[rankPlayer];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number played game:");
        int number = scanner.nextInt();
        int[] ranked = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Please enter score of game " + i + ":");
            ranked[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of your played game:");
        int playerGame = scanner.nextInt();
        int[] player = new int[playerGame];
        for (int i = 0; i < playerGame; i++) {
            System.out.println("Please enter score of game " + i + ":");
            player[i] = scanner.nextInt();
        }
        int[] finalRankedPlayer = new int[playerGame];
        for (int i = 0; i < playerGame; i++) {
            finalRankedPlayer[i] = getRank(ranked, player[i]);
            System.out.println("Ranked of player game " + i + " is: " + finalRankedPlayer[i]);
        }
    }
}
