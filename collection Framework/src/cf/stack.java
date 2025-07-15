package cf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        Integer removedElement = stack.pop();
        System.out.println(removedElement);
        Integer peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        int searched = stack.search(3);
        System.out.println(searched);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(1);
        linkedList.addLast(1);
        linkedList.getLast();
        linkedList.removeLast();
        linkedList.size();
        linkedList.isEmpty();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.get(arrayList.size()-1);
        arrayList.remove(arrayList.size()-1);
    }
}
