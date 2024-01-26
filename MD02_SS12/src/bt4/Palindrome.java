package bt4;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String st ="Able was I ere I saw Elba";
        String[] words = st.split("\\s+");
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        for (String word : words) {
            queue.offer(word);
            stack.push(word);
        }
        boolean flag = true;
        while(!stack.isEmpty() && !queue.isEmpty()) {
            if(!stack.pop().equals(queue.poll())) {
                flag =false;
                break;
            }
        }
        if(flag) {
            System.out.println("Hai chuoi la Palindrome");
        } else  {
            System.out.println(" chuoi khong la Palindrome");
        }


    }
}
