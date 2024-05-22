package session11_stack_queue;

public class ReservedArray {
    public int[] reserveArray(int[] array) {
        MyGenericStack<Integer> stack = new MyGenericStack();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,7,9};
        ReservedArray reservedArray = new ReservedArray();
        array = reservedArray.reserveArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
