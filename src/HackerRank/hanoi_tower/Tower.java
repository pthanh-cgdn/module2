package HackerRank.hanoi_tower;

import java.util.Stack;

public class Tower extends Stack <Integer> {
    private int lock=0;
    private static int CAPACITY = 5;
    @Override
    public Integer push(Integer number){
        if (size()==0){
            addElement(number);
            return number;
        } else if (number < peek()){
            addElement(number);
            return number;
        }
        return -1;
    }
}
