package Queue_Stack_FIFO_LIFO.Bro_Code.Stacks;

import java.util.Stack;


public class Main {
    public static void main(String[] args) {

        //stack = Lifo Data Structure. Last-In First-out
        //      stores objects into a sort of "vertical tower"
        //      push() to add to the top
        //      pop() to remove from the top.

        //uses of stacks:
        //1. undo/redo features in text editors
        //2. moving back/forward through a browser history
        //3. backtracking algos (maze, file directories)
        //4. calling functions (call stack)

        Stack<String> stack = new Stack<>();
        //pop, push, peek, empty, search.

        stack.push("DOOM");
        stack.push("WoW");
        stack.push("Forza");
        stack.push("Zelda");


        stack.pop();

        System.out.println(stack);

        //"taking" top-most object from stack and assign it to something:
        String myFavGame = stack.pop();
        System.out.println(myFavGame);

        //"checking" without removing:
        stack.peek();
        System.out.println(stack);

        //Finding an Element in the stack, gives out position relative to the top starting at 1
        //If it is not found, returns -1
        System.out.println(stack.search("DOOM"));

        /* adding i amount of Fallout76 copies, leads to OutOfMemory Error 
        for (int i = 0; i < 1000000000; i++) {
            stack.push("Fallout76");
        }*/
    }

  
        
}
    
