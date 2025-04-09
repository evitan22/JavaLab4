import java.util.*;

public class Main {
    public static void main(String[] args) {
        Audience[] audiences = {
            new Audience(120, 103, 18),
            new Audience(60, 40, 99),
            new Audience(100, 67, 3),
            new Audience(135, 100, 182)
        };
        MyCollection coll = new MyCollection(audiences);

        String[] arr1 = {"one", "two", "four", "three", "a"};
        MyCollectionGeneric<String> obj1 = new MyCollectionGeneric<>(arr1);
        Integer[] arr2 = {2, 3, 1, 6};
        MyCollectionGeneric<Integer> obj2 = new MyCollectionGeneric<>(arr2);

        final Comparator<Integer> SORT_NUMBER_COMPARATOR = new Comparator<Integer>() {
            public int compare(Integer e1, Integer e2) {
                return e2 - e1;
            }
        };

        final Comparator<String> SORT_STRING_COMPARATOR = new Comparator<String>() {
            public int compare(String e1, String e2) {
                return e2.compareTo(e1);
            }
        };

        obj1.sort(SORT_STRING_COMPARATOR);
        obj2.sort(SORT_NUMBER_COMPARATOR);
        
        System.out.println("------------------------");
        obj2.show();
        System.out.println("------------------------");
        obj1.show();
        System.out.println("------------------------");

        System.out.println(obj1.findItem("two")); 
        System.out.println(obj2.findItem(3)); 

        obj1.showAnyList(coll.getList());

    }
}