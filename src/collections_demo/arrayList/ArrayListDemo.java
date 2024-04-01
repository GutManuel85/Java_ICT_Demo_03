package collections_demo.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        final List<String> geniuses = new ArrayList<>();

        geniuses.add("Goethe");
        geniuses.add("Schiller");
        geniuses.add("Platon");
        geniuses.add("Kant");
        geniuses.add("Aristoteles");
        geniuses.add("Gut"); //😅

        printOut(geniuses);

        checkIsGenius("Gut", geniuses);
        checkIsGenius("Freud", geniuses);
    }

    private static <T> void printOut(List<T> arrayList){
        for(T element : arrayList){
            System.out.println(element);
        }
    }

    private static boolean checkIsGenius(String name, List<String> geniuses){
       boolean isGenius = geniuses.contains(name);
       if(isGenius){
           System.out.println(name + " is a genius");
       }else {
           System.out.println((name + " is NOT a genius"));
       }
       return isGenius;
    }

}
