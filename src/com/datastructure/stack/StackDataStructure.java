package com.datastructure.stack;

import com.datastructure.model.Book;

/**
 *
 * @author deecarneiro
 */
public class StackDataStructure {

    public static void main(String[] args) throws Exception {

        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        
        System.out.println(stack.isEmpty());

        System.out.println("Peek " + stack.peek());
        
        Stack<Book> books = new Stack<Book>(20);
        
        for(int i = 0; i < 6; i++){
            String twoDigits ="0" + i;
            System.out.println(twoDigits);
                    
            books.push(new Book("book"+i, "978-3-"+twoDigits+"-148410-0", "19"+twoDigits, "Author"+i));
        }
        
        System.out.println("Books: "+ books);

    }

}
