package HackerRank.hanoi_tower;

import java.util.Stack;

public class HanoiTower {
    public static int NUMBER = 5;
    public Tower[] towerList = new Tower[3];

    public static Tower[] moveTower(Tower[] towerList) {
        int key = 0;
        while (!towerList[0].isEmpty() && towerList[0].peek() == key + 1) {
            // di chuyen phan tu tu dau sang giua
            key = towerList[0].peek();
            towerList[1].push(towerList[0].pop());
            //di chuyen toan bo cuoi len dau
            Tower[] temp = moveTower(new Tower[]{towerList[2], towerList[1], towerList[0]});
            towerList[0] = temp[2];
            towerList[1] = temp[1];
            towerList[2] = temp[0];
            // di chuyen ptu giua sang cuoi
            towerList[2].push(towerList[1].pop());
            // di chuyen cac phan tu da di chuyen tu cuoi len dau ve lai cuoi
            towerList = moveTower(new Tower[]{towerList[0], towerList[1], towerList[2]});
        }
        return towerList;
    }

    public static void main(String[] args) {
        Tower beginTower = new Tower();
        for (int i = NUMBER; i > 0; i--) {
            beginTower.push(i);
        }
        Tower mediumTower = new Tower();
        Tower endTower = new Tower();
        Tower[] towerList = moveTower(new Tower[]{beginTower, mediumTower, endTower});
        System.out.println("Tong so phan tu cua thap End la: " + towerList[2].size());
        for (int i = 0; i < NUMBER; i++) {
            System.out.println("Phan tu thu " + i + ": " + towerList[2].pop());
        }
    }
}
