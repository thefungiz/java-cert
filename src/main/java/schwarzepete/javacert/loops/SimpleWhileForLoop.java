package schwarzepete.javacert.loops;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class SimpleWhileForLoop {

    public static void main(String[] args){
        List<String> values = Arrays.asList("One", "Two", "Three"); //MUTABLE
        List<String> moreValues = Stream.of("Red", "Blue", "Yellow", "Green").collect(toList());
        //List<String> list = List.of("foo", "bar", "baz");    JAVA 9  IMMUTABLE COLLECTION

//        while(true){
//            System.out.println("FOREVER!!");
//        }
//
//        for(;;){
//            System.out.println("FOREVER!!");
//        }

        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }

        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        for(String value : values){
            System.out.println(value);
        }

        Iterator<String> moreValuesIterator = moreValues.iterator();
        while(moreValuesIterator.hasNext()){
          System.out.println(moreValuesIterator.next());
        }

        int size = 0;
        while(size < moreValues.size()){
            System.out.println((moreValues.get(size)));
            size++;
        }

        size = 0;
        if(size < moreValues.size()){
            do{
                System.out.println(moreValues.get(size));
                size++;
            }
            while(size < moreValues.size());
        }

        //EXTRA EQUIVALENT LOOPING

        moreValues.forEach(tempValue -> {
           System.out.println(tempValue);
        });

        moreValues.forEach(tempValue -> System.out.println(tempValue));

        moreValues.stream().forEach((tempValue) -> System.out.println(tempValue));
    }
}
