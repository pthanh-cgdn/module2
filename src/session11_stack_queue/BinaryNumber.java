package session11_stack_queue;

import java.util.LinkedList;

public class BinaryNumber {
    private LinkedList<Integer> stack;
    private int binaryNumber;
    public BinaryNumber() {
        binaryNumber = 0;
        stack = new LinkedList<>();
    }
    public int convertDecimalToBinary(int number){
        while (number != 0){
            stack.addFirst(number%2);
            number=Math.floorDiv(number,2);
        }
        while (!stack.isEmpty()){
            binaryNumber = binaryNumber*10 + stack.removeFirst();
        }
        return binaryNumber;
    }

    public static void main(String[] args) {
        BinaryNumber binaryNumber = new BinaryNumber();
        System.out.println(binaryNumber.convertDecimalToBinary(30));
    }

}
