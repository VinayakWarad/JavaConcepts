package main.DequePkg;

import java.util.Deque;
import java.util.ArrayDeque;

//Use as a Queue (FIFO)
    public class DequeEx {
        public static void main(String[] args) {

        }
    }

//Stack
 class DequeAsStackFifo{
        public void myMethod() {
            Deque<String> stack = new ArrayDeque<>();

            stack.push("A");
            stack.push("B");
            stack.push("C");

            System.out.println(stack.pop()); // C
            System.out.println(stack.pop()); // B
        }
 }

 //Queue
 class DequeAsQueueLifo {
     public void myMethod() {
         Deque<String> queue = new ArrayDeque<>();

         queue.addLast("A");
         queue.addLast("B");
         queue.addLast("C");

         System.out.println(queue.removeFirst()); // A
         System.out.println(queue.removeFirst()); // B
     }
 }


/*

                      Common Dequeue methods

Method_Name	            Operation	                 Behavior
addFirst(e)   ->        Add to front	      	Inserts at the front
addLast(e)    ->        Add to end		        Inserts at the rear
removeFirst() ->        Remove from front		Removes from the front
removeLast()  ->        Remove from end		    Removes from the rear
peekFirst()   ->        Peek front		        Gets front without removing
peekLast()    ->        Peek end		        Gets rear without removing
push(e)       ->        Stack push.		        Push onto the front
pop()         ->        Stack pop		        Remove from the front

    */

