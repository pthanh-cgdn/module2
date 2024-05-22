package session11_stack_queue;

import session10_dsa_list.MyLinkedList;

public class PalinedromeString {
    private String str;
    public PalinedromeString(String str) {
        this.str = str.toLowerCase();
    }
    public boolean isPalindrome() {
        MyGenericStack<Character> stack = new MyGenericStack();
        MyLinkedListQueue<Character> queue = new MyLinkedListQueue();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            queue.enqueue(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.dequeue().data) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PalinedromeString palinedromeString = new PalinedromeString("Able was I ere I saw Elba");
        System.out.println(palinedromeString.isPalindrome());
    }
}
