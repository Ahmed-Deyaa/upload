package functionalInterface;

public class Act {

    public static void main(String args[]){

        FInter x = (a,b) -> a*b;
        System.out.println(x.multiply(5,6));
    }
}
