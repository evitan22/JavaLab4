public class Main {
    public static void main(String[] args) {
        Audience a1 =  new Audience(200, 250, 34);
        Audience[] audiences = {
            a1, a1,
            new Audience(120, 103, 18),
            new Audience(60, 40, 99),
            new Audience(100, 67, 3),
            new Audience(135, 100, 182)
        };

        SheduleItem[] items = {
            new SheduleItem("Prihodko", "English", "Friday", 2, audiences[0]),
            new SheduleItem("Tytynuk", "English", "Thursday", 5, audiences[3]),
            new SheduleItem("Mayer", "Programming", "Monday", 4, audiences[1]),
            new SheduleItem("Volochkov", "Aerobica", "Monday", 4, audiences[4]),
            new SheduleItem("Gavrilenko", "History", "Tuesday", 4, audiences[2]),
            new SheduleItem("Aboba", "C#", "Tuesday", 3, audiences[2])
        };

        MyCollection collInstance = new MyCollection(audiences);
        collInstance.show();
        System.out.println("-------------------------------------");
        System.out.println(collInstance.findItem(3));
        System.out.println("-------------------------------------");
        // collInstance.sortWithAnonimClass();
        // collInstance.sortWithLyambda();
        collInstance.sortWithMethod();
        collInstance.show();
        System.out.println("-------------------------------------");
        collInstance.getAverageNumber();
        System.out.println("-------------------------------------");

        MapStore mapchik = new MapStore(items);
        mapchik.showMap();
        System.out.println("-------------------------------------");
        mapchik.findItem("English");
        // System.out.println("-------------------------------------");
        // mapchik.removeItems("English");
        // mapchik.showMap();
        System.out.println("-------------------------------------");
        mapchik.getSum();
        System.out.println("-------------------------------------");
        // mapchik.sortWithAnonymousClass();
        // mapchik.sortWithLyambda();
        mapchik.sortWithMethod();
        mapchik.showMap();
    }
}