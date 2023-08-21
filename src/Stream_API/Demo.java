package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(6, 5, 2, 8, 1, 9, 7);

        //Example of the Builder-Pattern
        //opening a new stream
        nums.stream()
                .filter(n -> n%2==1)   //filter: only apply following code for odd numbers
                .sorted()   //sorting it
                .map(n -> n * 2)    //mapping the values (doubling it) 
                .forEach(n -> System.out.println(n));   //printing the stream
        
        //Advantages of using Stream:
        //The List will stay the same even if you change the Stream,
        //Once you use it, it can't be reused.
        //intStream.forEach(n -> System.out.println(n));
        //intStream.forEach(n -> System.out.println(n)); => Would throw an error since the stream is already used/closed.

    }
}
