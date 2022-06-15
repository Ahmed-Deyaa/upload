package lamda;



public class Lambda {

    public static void main(String args[]){



        Printable lamdaVar = (s)->{System.out.println("Meow"+ s) ;};
        printThing(lamdaVar);
    }

    public static void printThing(Printable thing){
        thing.print("!");
    }
}


