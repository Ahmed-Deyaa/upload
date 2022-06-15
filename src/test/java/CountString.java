import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountString {




    public static void main(String args[]) {
        String x = "welcome to code decode and code decode welcome you";
        List<String> list = Arrays.asList(x.split(" "));
        System.out.println(list);

        Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);


    }



    public static class DublicateElementList {

        public static void main(String args[]){
            Integer x[] ={10,28,87,10,20,28,80};
            List<Integer> list = Arrays.asList(x);
            Set<Integer> result = new HashSet<>();


            list.stream().filter(e->!result.add(e)).collect(Collectors.toSet())
                    .forEach(e-> System.out.println(e));

        }

    }
}


