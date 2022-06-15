package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {

    public static void main(String args[]){

        // Arrays are not objects, Primitive data, Fixed Size
        //Print the memory Addr ess
        String[] c = new String[4];
        String[] cc = new String[]{"a","b","c"};

        String [] countries = {"Egypt","USA","UK","UAE"};

        ArrayList<String> coun = new ArrayList<>(Arrays.asList(countries));
        ArrayList<String> coun2 = new ArrayList<>(Arrays.asList("Egypt","USA","UK","UAE"));


        // System.out.println(countries[5]);  OutOfPoundsException


        //ArrayLists are objects, Dynamic Arrays, handle class, objects
        //Print the Array perfectly
        // <> Diamond Operator
        ArrayList<String> listCountries = new ArrayList<>();
        listCountries.add("Egypt");
        listCountries.add("UK");
        listCountries.add("USA");
        listCountries.add("UAE");
        listCountries.add(1,"Mexico");


        for(String s : listCountries){
            System.out.println(s);
        }


    }
}
