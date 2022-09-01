package Lesson5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class HW1 {
    /*
    Реализуйте очередь first in first out (FIFO), используя только два стека.
    Реализованная очередь должна поддерживать все функции обычной очереди (push, peek, pop, и empty).

    Реализовать MyQueueкласс:

    void push(int x) Помещает элемент x в конец очереди.
    int pop() Удаляет элемент из начала очереди и возвращает его.
    int peek() Возвращает элемент в начале очереди.
    boolean empty() Возвращает true, если очередь пуста, falseв противном случае.
    Примечания:

    Вы должны использовать только стандартные операции стека, что означает,
    что допустимы только push to top операции , peek/pop from top, size, и is empty.
    В зависимости от вашего языка, стек может не поддерживаться изначально.
    Вы можете имитировать стек с помощью списка или deque (двусторонняя очередь),
    если используете только стандартные операции стека.
         */
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        myQueue.peek(); // return 1
        myQueue.pop(); // return 1, queue is [2]
        myQueue.empty(); // return false
    }
}


class MyQueue {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public MyQueue() {
    }

    public void push(int x) {
        if (stack.isEmpty()){
            stack.push(x);
        }else {
            while (!stack.isEmpty()){
                stack2.push(stack.pop());
            }
            stack.push(x);
            while (!stack2.isEmpty()){
                stack.push(stack2.pop());
            }
        }
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
