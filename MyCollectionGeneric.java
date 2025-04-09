import java.util.*;

public class MyCollectionGeneric <T> {
    List<T> myList = new ArrayList<>();
    
    public MyCollectionGeneric(T[] arr) {
        this.myList.addAll(new HashSet<T>(Arrays.asList(arr)));
    }

    public void show() {
        this.myList.stream().forEach(a -> System.out.println(a));
    }

    //4.2
    public int findItem(T expectedValue) {
        return myList.indexOf(expectedValue);
    }

    //4.2 sort для використання компаратора
    public void sort(Comparator<T> comparator) {
        Collections.sort(this.myList, comparator);
    }

    public void showAnyList(List<?> list) {
        list.stream().forEach(a -> System.out.println(a));
    }
}