import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Shedule {
    ArrayList<SheduleItem> shedules = new ArrayList<>();

    public Shedule(SheduleItem[] items) {
        Collections.addAll(this.shedules, items);
    }

    public void show() {
        System.out.println("--------------------------------------------------------");
        for(SheduleItem item : shedules) {
            System.out.println("Lesson is " + item.subjectName + " by teacher " + item.teachersName);
        }
        System.out.println("--------------------------------------------------------");
    }

    public void addSheduleItem(SheduleItem item) {
        this.shedules.add(item);
    }

    public void removeSheduleItem(String name, String day) {
        int index = IntStream.range(0, this.shedules.size())
                .filter(i -> this.shedules.get(i).subjectName.equals(name) && this.shedules.get(i).day.equals(day))
                .findFirst()
                .orElse(-1);
        if(index != -1) {
            this.shedules.remove(index);
            System.out.println("The item was deleted.");
        }
        else {
            System.out.println("There are no coincidences for deleting.");
        }
    }

    public List<SheduleItem> showSheduleForDay(String dayName) {
        List<SheduleItem> filteredList = this.shedules.stream()
            .filter(item -> item.day.equals(dayName))
            .collect(Collectors.toList()); 

            Collections.sort(filteredList, Comparator.comparingInt(p -> p.numberOfLesson));
            return filteredList;
    }

    public void findFreeAudience(int number, String day, Audience[] allAudiences) {
        Optional<SheduleItem> sheduleItem = this.shedules.stream()
            .filter(item -> {
                return item.day.equals(day) && item.numberOfLesson == number;
            })
            .findFirst();

            SheduleItem foundItem = sheduleItem.orElse(null);

        if (foundItem != null) {
            System.out.println("There is a free audience for the lesson.");

            int num = foundItem.audience.getNumberOfCabinet();

            List<Audience> filteredMass = Arrays.stream(allAudiences)
                .filter(item -> item.getNumberOfCabinet() != num)
                .collect(Collectors.toList());

            System.out.println("--------------------------------------------------------");
            for(Audience item : filteredMass) {
                System.out.println("There are available audiences for your lesson, the number of cabinet is " + item.getNumberOfCabinet());
            }
            System.out.println("--------------------------------------------------------");
        }
        else {
            System.out.println("There isn't a free audience for the lesson.");
        }
    }
}