package Chapter3;

import java.util.Stack;

public class ChapterThree {

    public ChapterThree() { }

    // Question 3.5: Implement a MyQueue class which implements a queue using two stacks.
    static class MyQueue<T> {

        private Stack<T> s1;
        private Stack<T> s2;

        public MyQueue() {
            this.s1 = new Stack<T>();
            this.s2 = new Stack<T>();
        }

        public void enqueue(T item) {
            s1.push(item);
        }

        public T dequeue() {

            if(this.isEmpty()) return null;

            if(s2.isEmpty()) {
                while(!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.pop();
        }

        public T front() {

            if(s2.isEmpty()) {
                while(!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.peek();
        }

        public boolean isEmpty() {
            if(s1.size() + s2.size() == 0) return true;
            else return false;
        }

        public int size() {
            return s1.size() + s2.size();
        }
    }
    /*
        Question 3.6: Write a program to sort a stack in ascending order. You should not make any assumptions
        about how the stack is implemented. The following are the only functions that
        should be used to write this program: push | pop | peek | isEmpty.
    */
    static class AscendingStack {

        private Stack<Integer> s1;
        private Stack<Integer> s2;

        public AscendingStack() {
            this.s1 = new Stack<Integer>();
            this.s2 = new Stack<Integer>();
        }

        public void push(int value) {

            if(s1.isEmpty())
                s1.push(value);
            else {
                while(!isEmpty() && s1.peek() >= value) {
                    s2.push(s1.pop());
                }

                s1.push(value);

                while(!s2.isEmpty()) {
                    s1.push(s2.pop());
                }
            }
        }

        public int pop() {
            if(s1.isEmpty()) return -1;
            return s1.pop();
        }

        public int peek() {
            return s1.peek();
        }

        public boolean isEmpty() {
            return s1.isEmpty();
        }
    }
}
