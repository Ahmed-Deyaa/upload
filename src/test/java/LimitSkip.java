import java.util.Arrays;
import java.util.List;

public class LimitSkip {

    public static void main(String args[]){

        List<Integer> list = Arrays.asList(5,6,7,8,13,24,9,2,51,1);
        list.stream().limit(4).forEach(x-> System.out.println(x));
        list.stream().skip(4).forEach(x-> System.out.println(x));





    }
}
