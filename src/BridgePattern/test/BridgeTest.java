package BridgePattern.test;

import BridgePattern.impl.ArrayImpl;
import BridgePattern.impl.LinkedListImpl;
import BridgePattern.list.Queue;
import BridgePattern.list.Stack;

public class BridgeTest {

    public static void main(String[] args) {

        Stack<String> linkedListStack = new Stack<String>(new LinkedListImpl<String>());
        linkedListStack.push("AAA");
        linkedListStack.push("BBB");
        linkedListStack.push("CCC");

        System.out.println(linkedListStack.toString());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
        System.out.println("===============================");


        Stack<String> arraryStack  = new Stack<String>(new ArrayImpl<>());
        arraryStack.push("AAA");
        arraryStack.push("BBB");
        arraryStack.push("CCC");

        System.out.println(arraryStack.toString());
        System.out.println(arraryStack.pop());
        System.out.println(arraryStack.pop());
        System.out.println(arraryStack.pop());

        System.out.println("===============================");
        Queue<String> arraryQeue  = new Queue<String>(new ArrayImpl<String>());
        arraryQeue.enQueue("AAA");
        arraryQeue.enQueue("BBB");
        arraryQeue.enQueue("CCC");
        System.out.println(arraryQeue.toString());
        System.out.println(arraryQeue.deQueue());
        System.out.println(arraryQeue.deQueue());
        System.out.println(arraryQeue.deQueue());
        System.out.println("===============================");
    }
}
